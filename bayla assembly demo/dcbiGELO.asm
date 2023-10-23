; Binary to Decimal Converter
; by Bayla, Angelo
; from BSCS-2A

.model small

.data
    msg db 0ah, 0dh, 'Enter a binary: $'
    errmsg db 0ah, 0dh, 'Invalid binary. Please try again. $'
    bineight db 0
    binfour db 0
    bintwo db 0
    binone db 0
    output db 0ah, 0dh, 'Equivalent in decimal: $'
    total db 48
    double db 48

    
.code   
main:
    mov ax, @data
    mov ds, ax
    
    mov ah, 09h
    mov dx, offset msg
    int 21h
    
    mov ah, 01h
    int 21h
    cmp al, '1'
    
    mov bineight, al
    
    cmp bineight, '0'
    je gofour
    
    add total, 8
    
    gofour:
    mov ah, 01h
    int 21h
    cmp al, '1'
    
    mov binfour, al
    
    cmp binfour, '0'
    je gotwo
    
    add total, 4
    
    ;check if > 9
    cmp total, 57
    jl gotwo
    
    add double, 1 
    sub total, 10
    
    gotwo:
    mov ah, 01h
    int 21h
    cmp al, '1'
    
    mov bintwo, al
    
    cmp bintwo, '0'
    je goone
    
    add total, 2
    
    ;check if > 9
    cmp total, 57
    jl goone
    
    add double, 1 
    sub total, 12
    
    goone:
    mov ah, 01h
    int 21h
    cmp al, '1'
    
    mov binone, al
    
    cmp binone, '0'
    je goprint
    
    add total, 1
    
    ;check if > 9
    cmp total, 57
    jle goprint
    
    add double, 1 
    sub total, 15
    
    goprint:
    mov ah, 09h
    mov dx, offset output
    int 21h   
    
    cmp double, '0'
    je continueprint
    
    mov ah, 02h
    mov dl, '1'
    int 21h
    
    continueprint:
    ; printing total 
    mov ah, 02h
    mov dl, total
    int 21h
    
    ;end 
    mov ah, 4ch
    int 21h
    
end main
    