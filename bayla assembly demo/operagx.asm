.model small

.data
    input1 db 'Enter 1st number: $'
    input2 db 0ah, 0dh, 'Enter 2nd number: $'
    num1 db 0
    num2 db 0
    msg db 0ah, 0dh, 'The sum is: $'
    sum db 0

.code
main:
    mov ax, @data
    mov ds, ax
    
    mov ah, 09h
    mov dx, offset input1
    int 21h
    
    mov ah, 01
    int 21h
    mov num1, al
    
    mov ah, 09h
    mov dx, offset input2
    int 21h
    
    mov ah, 01
    int 21h
    mov num2, al
    
    mov al, num1
    add al, num2
    
    mov ah, 09h
    mov dx, offset msg
    int 21h
    
    sub al, 48
     
    cmp al, 58
    jge GREAT
    
    mov ah, 02h
    mov dl, al
    int 21h
    
    mov ah, 4ch
    int 21h
    
GREAT:
    sub al, 10
    mov sum, al
    
    mov dl, '1'
    mov ah, 02h
    int 21h
    
    mov ah, 02h
    mov dl, sum
    int 21h
    
    mov ah, 4ch
    int 21h
    

end main