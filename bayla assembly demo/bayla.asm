.model small

.data
    input db 'Enter a number$'
    ; with new line after db
    output db 0ah, 0dh, 'Your number + 3: $'
    ;variable with 0
    number db 0
    morethan db 0ah, 0dh, 'Your number is more than 5 $'
    lessthan db 0ah, 0dh, 'Your number is less than or equal to 5 $'

.code
main:
    mov ax, @data
    mov ds, ax
    
    mov ah, 09h
    mov dx, offset input
    int 21h

    ;asking input
    mov ah, 07h
    int 21h
    
    ; add 3 to output
    add al, 3
    
    mov number, al
    
    mov ah, 09h
    mov dx, offset output
    int 21h
    
    mov ah, 02h
    mov dl, number
    int 21h
    
    cmp al, 5
    jg GREATER
    
    mov ah, 09h
    mov dx, offset lessthan
    int 21h
    
    mov ah, 4ch
    int 21h
    
GREATER:
    mov ah, 09h
    mov dx, offset morethan
    int 21h
    
    mov ah, 4ch
    int 21h
    
end main