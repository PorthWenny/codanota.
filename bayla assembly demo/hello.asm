.model small
.stack 100h

.data
    output db 'hello world$'

.code
    main:
    ;remove garbage character
    mov ax, @data
    mov ds, ax
    
    ;printing string
    mov ah, 09h
    mov dx, offset output
    int 21h
    
    ;printing char
    mov dl, 'j'
    mov ah, 02h
    int 21h
    
    ;stop running, exit
    mov ah, 4ch
    int 21h

end main