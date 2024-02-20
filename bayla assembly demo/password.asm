.model small

.data
    input db 'Enter four characters: $'
    char1 db 0
    char2 db 0
    char3 db 0
    char4 db 0
    output db 0ah, 0dh, 'You entered: $'
.code 
  main:
    mov ax, @data
    mov ds, ax
    
    mov ah, 09h
    mov dx, offset input
    int 21h
    
    ; get a value for a variable
    mov ah, 07h
    int 21h
    mov char1, al
    
    ;print an asterisk
    mov dl, '*'
    mov ah, 02h
    int 21h
    
    mov ah, 07h
    int 21h
    mov char2, al
    
    mov dl, '*'
    mov ah, 02h
    int 21h
    
    mov ah, 07h
    int 21h
    mov char3, al
    
    mov dl, '*'
    mov ah, 02h
    int 21h
    
    mov ah, 07h
    int 21h
    mov char4, al
    
    mov dl, '*'
    mov ah, 02h
    int 21h
    
    mov ah, 09h
    mov dx, offset output
    int 21h
    
    mov ah, 02h
    mov dl, char1
    int 21h
    
    mov ah, 02h
    mov dl, char2
    int 21h
    
    mov ah, 02h
    mov dl, char3
    int 21h
    
    mov ah, 02h
    mov dl, char4
    int 21h
    
    mov ah, 4ch
    int 21h
    
end main