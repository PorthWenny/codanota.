; Delay and Printing 0-99 by Angelo Bayla

.model small

.data
    mess db 'Hello $'
    count dw 43690
    num db '0'

.code
main:
    mov ax, @data
    mov ds, ax
    
    mov cx, 5
    mov bl, '0'

count_loop:

    ; check if the tens-digit reaches 9 when the ones-digit is 9, end if true
    cmp num, '9'
    jle donotend1
    
    mov ah, 4ch
    int 21h

    donotend1:
    call display_number
    call delay
    
    inc bl
    
    cmp bl, '9'
    ; increment the digit every 9th ones-digit
    jg incrementer
    
    loop count_loop
    
    mov ah, 4ch
    int 21h
    
    
; print double digits
incrementer:

    inc num
    jmp main

; print numbers
display_number:
        
    ;skip 0
    cmp num, '0'
    je skip_zero
    
    ; print the tens-digit
    mov ah, 02h
    mov dl, num
    int 21h
   
    skip_zero:
    mov ah, 02h
    mov dl, bl
    int 21h
    
    mov dl,' '
    int 21h
    
    ; return call
    ret
    
; add duration of delay
delay:

    mov cx, count
    
delay_loop:

    dec cx
    ; jump non zero to delay_loop (for repetition)
    jnz delay_loop
    
    ret

end main