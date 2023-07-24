.class public final Lm/b/j/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final s:[C


# instance fields
.field public final a:Lm/b/j/a;

.field public final b:Lm/b/j/d0;

.field public c:Lm/b/j/i3;

.field public d:Lm/b/j/q0;

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/StringBuilder;

.field public h:Ljava/lang/StringBuilder;

.field public i:Lm/b/j/o0;

.field public j:Lm/b/j/n0;

.field public k:Lm/b/j/m0;

.field public l:Lm/b/j/i0;

.field public m:Lm/b/j/k0;

.field public n:Lm/b/j/j0;

.field public o:Ljava/lang/String;

.field public p:Z

.field public final q:[I

.field public final r:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [C

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lm/b/j/s0;->s:[C

    .line 2
    invoke-static {v0}, Ljava/util/Arrays;->sort([C)V

    return-void

    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
        0x3cs
        0x26s
    .end array-data
.end method

.method public constructor <init>(Lm/b/j/a;Lm/b/j/d0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lm/b/j/i3;->b:Lm/b/j/i3;

    iput-object v0, p0, Lm/b/j/s0;->c:Lm/b/j/i3;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lm/b/j/s0;->e:Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lm/b/j/s0;->f:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lm/b/j/s0;->g:Ljava/lang/StringBuilder;

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lm/b/j/s0;->h:Ljava/lang/StringBuilder;

    .line 7
    new-instance v0, Lm/b/j/n0;

    invoke-direct {v0}, Lm/b/j/n0;-><init>()V

    iput-object v0, p0, Lm/b/j/s0;->j:Lm/b/j/n0;

    .line 8
    new-instance v0, Lm/b/j/m0;

    invoke-direct {v0}, Lm/b/j/m0;-><init>()V

    iput-object v0, p0, Lm/b/j/s0;->k:Lm/b/j/m0;

    .line 9
    new-instance v0, Lm/b/j/i0;

    invoke-direct {v0}, Lm/b/j/i0;-><init>()V

    iput-object v0, p0, Lm/b/j/s0;->l:Lm/b/j/i0;

    .line 10
    new-instance v0, Lm/b/j/k0;

    invoke-direct {v0}, Lm/b/j/k0;-><init>()V

    iput-object v0, p0, Lm/b/j/s0;->m:Lm/b/j/k0;

    .line 11
    new-instance v0, Lm/b/j/j0;

    invoke-direct {v0}, Lm/b/j/j0;-><init>()V

    iput-object v0, p0, Lm/b/j/s0;->n:Lm/b/j/j0;

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lm/b/j/s0;->p:Z

    new-array v0, v0, [I

    .line 13
    iput-object v0, p0, Lm/b/j/s0;->q:[I

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 14
    iput-object v0, p0, Lm/b/j/s0;->r:[I

    .line 15
    iput-object p1, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    .line 16
    iput-object p2, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    return-void
.end method


# virtual methods
.method public a(Z)Lm/b/j/o0;
    .locals 0

    if-eqz p1, :cond_0

    .line 48
    iget-object p1, p0, Lm/b/j/s0;->j:Lm/b/j/n0;

    invoke-virtual {p1}, Lm/b/j/n0;->l()Lm/b/j/o0;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lm/b/j/s0;->k:Lm/b/j/m0;

    invoke-virtual {p1}, Lm/b/j/o0;->l()Lm/b/j/o0;

    :goto_0
    iput-object p1, p0, Lm/b/j/s0;->i:Lm/b/j/o0;

    return-object p1
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lm/b/j/s0;->p:Z

    return-void
.end method

.method public a(C)V
    .locals 0

    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .line 49
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    invoke-virtual {v0}, Lm/b/j/d0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    new-instance v1, Lm/b/j/c0;

    iget-object v2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v2}, Lm/b/j/a;->o()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "Invalid character reference: %s"

    invoke-direct {v1, v2, p1, v3}, Lm/b/j/c0;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Lm/b/j/i3;)V
    .locals 1

    .line 15
    iget-object v0, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v0}, Lm/b/j/a;->a()V

    .line 16
    iput-object p1, p0, Lm/b/j/s0;->c:Lm/b/j/i3;

    return-void
.end method

.method public a(Lm/b/j/q0;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm/b/j/s0;->e:Z

    const-string v1, "There is an unread token pending!"

    invoke-static {v0, v1}, Lm/b/h/j;->a(ZLjava/lang/String;)V

    .line 2
    iput-object p1, p0, Lm/b/j/s0;->d:Lm/b/j/q0;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lm/b/j/s0;->e:Z

    .line 4
    iget-object v0, p1, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->c:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    .line 5
    check-cast p1, Lm/b/j/n0;

    .line 6
    iget-object v0, p1, Lm/b/j/o0;->b:Ljava/lang/String;

    iput-object v0, p0, Lm/b/j/s0;->o:Ljava/lang/String;

    .line 7
    iget-boolean p1, p1, Lm/b/j/o0;->i:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lm/b/j/s0;->p:Z

    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lm/b/j/p0;->d:Lm/b/j/p0;

    if-ne v0, v1, :cond_1

    .line 10
    check-cast p1, Lm/b/j/m0;

    .line 11
    iget-object p1, p1, Lm/b/j/o0;->j:Lm/b/i/b;

    if-eqz p1, :cond_1

    const-string p1, "Attributes incorrectly present on end tag"

    .line 12
    invoke-virtual {p0, p1}, Lm/b/j/s0;->c(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a([I)V
    .locals 3

    .line 13
    new-instance v0, Ljava/lang/String;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1}, Ljava/lang/String;-><init>([III)V

    invoke-virtual {p0, v0}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/Character;Z)[I
    .locals 8

    .line 18
    iget-object v0, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v0}, Lm/b/j/a;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p1, :cond_1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    iget-object v0, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v0}, Lm/b/j/a;->j()C

    move-result v0

    if-ne p1, v0, :cond_1

    return-object v1

    .line 20
    :cond_1
    iget-object p1, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    sget-object v0, Lm/b/j/s0;->s:[C

    invoke-virtual {p1, v0}, Lm/b/j/a;->d([C)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object v1

    .line 21
    :cond_2
    iget-object p1, p0, Lm/b/j/s0;->q:[I

    .line 22
    iget-object v0, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v0}, Lm/b/j/a;->l()V

    .line 23
    iget-object v0, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    const-string v2, "#"

    invoke-virtual {v0, v2}, Lm/b/j/a;->c(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "missing semicolon"

    const-string v3, ";"

    const/4 v4, 0x0

    if-eqz v0, :cond_a

    .line 24
    iget-object p2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    const-string v0, "X"

    invoke-virtual {p2, v0}, Lm/b/j/a;->d(Ljava/lang/String;)Z

    move-result p2

    .line 25
    iget-object v0, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    if-eqz p2, :cond_3

    invoke-virtual {v0}, Lm/b/j/a;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lm/b/j/a;->d()Ljava/lang/String;

    move-result-object v0

    .line 26
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_4

    const-string p1, "numeric reference with no numerals"

    .line 27
    invoke-virtual {p0, p1}, Lm/b/j/s0;->a(Ljava/lang/String;)V

    .line 28
    iget-object p1, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {p1}, Lm/b/j/a;->p()V

    return-object v1

    .line 29
    :cond_4
    iget-object v1, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v1, v3}, Lm/b/j/a;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 30
    invoke-virtual {p0, v2}, Lm/b/j/s0;->a(Ljava/lang/String;)V

    :cond_5
    if-eqz p2, :cond_6

    const/16 p2, 0x10

    goto :goto_1

    :cond_6
    const/16 p2, 0xa

    :goto_1
    const/4 v1, -0x1

    .line 31
    :try_start_0
    invoke-static {v0, p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 p2, -0x1

    :goto_2
    if-eq p2, v1, :cond_9

    const v0, 0xd800

    if-lt p2, v0, :cond_7

    const v0, 0xdfff

    if-le p2, v0, :cond_9

    :cond_7
    const v0, 0x10ffff

    if-le p2, v0, :cond_8

    goto :goto_3

    .line 32
    :cond_8
    aput p2, p1, v4

    return-object p1

    :cond_9
    :goto_3
    const-string p2, "character outside of valid range"

    .line 33
    invoke-virtual {p0, p2}, Lm/b/j/s0;->a(Ljava/lang/String;)V

    const p2, 0xfffd

    .line 34
    aput p2, p1, v4

    return-object p1

    .line 35
    :cond_a
    iget-object v0, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v0}, Lm/b/j/a;->g()Ljava/lang/String;

    move-result-object v0

    .line 36
    iget-object v5, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    const/16 v6, 0x3b

    invoke-virtual {v5, v6}, Lm/b/j/a;->b(C)Z

    move-result v5

    .line 37
    invoke-static {v0}, Lm/b/i/p;->a(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_c

    invoke-static {v0}, Lm/b/i/p;->b(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    if-eqz v5, :cond_b

    goto :goto_4

    :cond_b
    const/4 v6, 0x0

    goto :goto_5

    :cond_c
    :goto_4
    const/4 v6, 0x1

    :goto_5
    if-nez v6, :cond_e

    .line 38
    iget-object p1, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {p1}, Lm/b/j/a;->p()V

    if-eqz v5, :cond_d

    new-array p1, v7, [Ljava/lang/Object;

    aput-object v0, p1, v4

    const-string p2, "invalid named referenece \'%s\'"

    .line 39
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/s0;->a(Ljava/lang/String;)V

    :cond_d
    return-object v1

    :cond_e
    if-eqz p2, :cond_10

    .line 40
    iget-object p2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {p2}, Lm/b/j/a;->n()Z

    move-result p2

    if-nez p2, :cond_f

    iget-object p2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {p2}, Lm/b/j/a;->m()Z

    move-result p2

    if-nez p2, :cond_f

    iget-object p2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    const/4 v5, 0x3

    new-array v5, v5, [C

    fill-array-data v5, :array_0

    invoke-virtual {p2, v5}, Lm/b/j/a;->c([C)Z

    move-result p2

    if-eqz p2, :cond_10

    .line 41
    :cond_f
    iget-object p1, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {p1}, Lm/b/j/a;->p()V

    return-object v1

    .line 42
    :cond_10
    iget-object p2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {p2, v3}, Lm/b/j/a;->c(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_11

    .line 43
    invoke-virtual {p0, v2}, Lm/b/j/s0;->a(Ljava/lang/String;)V

    .line 44
    :cond_11
    iget-object p2, p0, Lm/b/j/s0;->r:[I

    invoke-static {v0, p2}, Lm/b/i/p;->a(Ljava/lang/String;[I)I

    move-result p2

    if-ne p2, v7, :cond_12

    .line 45
    iget-object p2, p0, Lm/b/j/s0;->r:[I

    aget p2, p2, v4

    aput p2, p1, v4

    return-object p1

    :cond_12
    const/4 p1, 0x2

    if-ne p2, p1, :cond_13

    .line 46
    iget-object p1, p0, Lm/b/j/s0;->r:[I

    return-object p1

    .line 47
    :cond_13
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unexpected characters returned for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/String;)V

    throw v1

    :array_0
    .array-data 2
        0x3ds
        0x2ds
        0x5fs
    .end array-data
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lm/b/j/s0;->o:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/s0;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lm/b/j/s0;->f:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lm/b/j/s0;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lm/b/j/s0;->g:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/b/j/s0;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    :cond_1
    iget-object v0, p0, Lm/b/j/s0;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public b(Lm/b/j/i3;)V
    .locals 5

    .line 7
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    invoke-virtual {v0}, Lm/b/j/d0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    new-instance v1, Lm/b/j/c0;

    iget-object v2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v2}, Lm/b/j/a;->o()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "Unexpectedly reached end of file (EOF) in input state [%s]"

    invoke-direct {v1, v2, p1, v3}, Lm/b/j/c0;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/s0;->n:Lm/b/j/j0;

    invoke-virtual {v0}, Lm/b/j/j0;->l()Lm/b/j/q0;

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    .line 4
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    invoke-virtual {v0}, Lm/b/j/d0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    new-instance v1, Lm/b/j/c0;

    iget-object v2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v2}, Lm/b/j/a;->o()I

    move-result v2

    invoke-direct {v1, v2, p1}, Lm/b/j/c0;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c(Lm/b/j/i3;)V
    .locals 6

    .line 2
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    invoke-virtual {v0}, Lm/b/j/d0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lm/b/j/s0;->b:Lm/b/j/d0;

    new-instance v1, Lm/b/j/c0;

    iget-object v2, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v2}, Lm/b/j/a;->o()I

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v5}, Lm/b/j/a;->j()C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    const-string p1, "Unexpected character \'%s\' in input state [%s]"

    invoke-direct {v1, v2, p1, v3}, Lm/b/j/c0;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 2
    iget-object v0, p0, Lm/b/j/s0;->m:Lm/b/j/k0;

    invoke-virtual {v0}, Lm/b/j/k0;->l()Lm/b/j/q0;

    return-void
.end method

.method public d(Lm/b/j/i3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/b/j/s0;->c:Lm/b/j/i3;

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/s0;->h:Ljava/lang/StringBuilder;

    invoke-static {v0}, Lm/b/j/q0;->a(Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/s0;->n:Lm/b/j/j0;

    invoke-virtual {p0, v0}, Lm/b/j/s0;->a(Lm/b/j/q0;)V

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/s0;->m:Lm/b/j/k0;

    invoke-virtual {p0, v0}, Lm/b/j/s0;->a(Lm/b/j/q0;)V

    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v0}, Lm/b/j/o0;->o()V

    .line 2
    iget-object v0, p0, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p0, v0}, Lm/b/j/s0;->a(Lm/b/j/q0;)V

    return-void
.end method

.method public i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/s0;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v0}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm/b/j/s0;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Lm/b/j/q0;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm/b/j/s0;->p:Z

    if-nez v0, :cond_0

    const-string v0, "Self closing flag not acknowledged"

    .line 2
    invoke-virtual {p0, v0}, Lm/b/j/s0;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lm/b/j/s0;->p:Z

    .line 4
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lm/b/j/s0;->e:Z

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lm/b/j/s0;->c:Lm/b/j/i3;

    iget-object v1, p0, Lm/b/j/s0;->a:Lm/b/j/a;

    invoke-virtual {v0, p0, v1}, Lm/b/j/i3;->a(Lm/b/j/s0;Lm/b/j/a;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lm/b/j/s0;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-lez v0, :cond_2

    .line 7
    iget-object v0, p0, Lm/b/j/s0;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    iget-object v3, p0, Lm/b/j/s0;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    invoke-virtual {v3, v2, v4}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 9
    iput-object v1, p0, Lm/b/j/s0;->f:Ljava/lang/String;

    .line 10
    iget-object v1, p0, Lm/b/j/s0;->l:Lm/b/j/i0;

    invoke-virtual {v1, v0}, Lm/b/j/i0;->a(Ljava/lang/String;)Lm/b/j/i0;

    return-object v1

    .line 11
    :cond_2
    iget-object v0, p0, Lm/b/j/s0;->f:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 12
    iget-object v2, p0, Lm/b/j/s0;->l:Lm/b/j/i0;

    invoke-virtual {v2, v0}, Lm/b/j/i0;->a(Ljava/lang/String;)Lm/b/j/i0;

    .line 13
    iput-object v1, p0, Lm/b/j/s0;->f:Ljava/lang/String;

    return-object v2

    .line 14
    :cond_3
    iput-boolean v2, p0, Lm/b/j/s0;->e:Z

    .line 15
    iget-object v0, p0, Lm/b/j/s0;->d:Lm/b/j/q0;

    return-object v0
.end method
