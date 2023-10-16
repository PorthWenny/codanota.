; Procedure demo by Angelo Bayla

.model small

.data
    mess db 'Hello $'

.code
main:
    mov ax, @data
    mov ds, ax
    
 
    ; call procedure (like a function)
    call msg

    
    ; end or return here to stop looping
    mov ah, 4ch
    int 21h
    
; initiate procedure
msg PROC NEAR

    ; put *10* spaces before printing /mess/
    
    ; ??? waiting for upd
    
    mov dl, 10
    int 10h
    

    mov ah, 09h
    mov dx, offset mess
    int 21h
    
    ret
    
msg ENDP

end main