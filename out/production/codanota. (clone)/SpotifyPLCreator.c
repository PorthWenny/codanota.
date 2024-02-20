#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Song {
    char name[50];
    char artist[50];
    char album[50];
    int duration; // in seconds
    struct Song *next;
} Song;

void create_playlist(Song **playlist, char *name, char *artist, char *album, int duration);
void display_playlist(Song *playlist);
void add_song(Song **playlist, char *name, char *artist, char *album, int duration);
void edit_song(Song *playlist, char *name, char *artist, char *album, int duration);
void delete_song(Song **playlist, char *name);
void clear_playlist(Song **playlist);

int main() {
    Song *playlist = NULL;
    create_playlist(&playlist, "Song1", "Artist1", "Album1", 180);
    add_song(&playlist, "Song2", "Artist2", "Album2", 210);
    add_song(&playlist, "Song3", "Artist3", "Album3", 230);
    display_playlist(playlist);

    printf("Editing song...\n");
    edit_song(playlist, "Song2", "Artist2-Edited", "Album2-Edited", 205);
    display_playlist(playlist);

    printf("Deleting song...\n");
    delete_song(&playlist, "Song1");
    display_playlist(playlist);

    printf("Clearing playlist...\n");
    clear_playlist(&playlist);
    display_playlist(playlist);

    return 0;
}

void create_playlist(Song **playlist, char *name, char *artist, char *album, int duration) {
    *playlist = (Song *)malloc(sizeof(Song));
    strcpy((*playlist)->name, name);
    strcpy((*playlist)->artist, artist);
    strcpy((*playlist)->album, album);
    (*playlist)->duration = duration;
    (*playlist)->next = NULL;
}

void display_playlist(Song *playlist) {
    if (playlist == NULL) {
        printf("Playlist is empty!\n");
        return;
    }
    Song *temp = playlist;
    while (temp != NULL) {
        printf("Song Name: %s, Artist: %s, Album: %s, Duration: %d seconds\n", temp->name, temp->artist, temp->album, temp->duration);
        temp = temp->next;
    }
}

void add_song(Song **playlist, char *name, char *artist, char *album, int duration) {
    Song *temp = *playlist;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = (Song *)malloc(sizeof(Song));
    strcpy(temp->next->name, name);
    strcpy(temp->next->artist, artist);
    strcpy(temp->next->album, album);
    temp->next->duration = duration;
    temp->next->next = NULL;
}

void edit_song(Song *playlist, char *name, char *artist, char *album, int duration) {
    Song *temp = playlist;
    while (temp != NULL) {
        if (strcmp(temp->name, name) == 0) {
            strcpy(temp->artist, artist);
            strcpy(temp->album, album);
            temp->duration = duration;
            break;
        }
        temp = temp->next;
    }
}

void delete_song(Song **playlist, char *name) {
    if (*playlist == NULL) {
        printf("Playlist is empty!\n");
        return;
    }

    Song *temp = *playlist, *prev = NULL;
    if (strcmp((*playlist)->name, name) == 0) {
        *playlist = (*playlist)->next;
        free(temp);
        return;
    }

    while (temp != NULL && strcmp(temp->name, name) != 0) {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Song not found in the playlist!\n");
        return;
    }

    prev->next = temp->next;
    free(temp);
}

void clear_playlist(Song **playlist) {
    Song *current = *playlist;
    Song *next;

    while (current != NULL) {
        next = current->next;
        free(current);
        current = next;
    }

    *playlist = NULL;
}
