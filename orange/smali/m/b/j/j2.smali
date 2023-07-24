.class public final enum Lm/b/j/j2;
.super Lm/b/j/i3;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lm/b/j/i3;-><init>(Ljava/lang/String;ILm/b/j/d1;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/s0;Lm/b/j/a;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result p2

    const-string v0, "--"

    if-eqz p2, :cond_4

    const/16 v1, 0x21

    if-eq p2, v1, :cond_3

    const/16 v1, 0x2d

    if-eq p2, v1, :cond_2

    const/16 v1, 0x3e

    if-eq p2, v1, :cond_1

    const v1, 0xffff

    if-eq p2, v1, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 3
    iget-object v1, p1, Lm/b/j/s0;->n:Lm/b/j/j0;

    iget-object v1, v1, Lm/b/j/j0;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    sget-object p2, Lm/b/j/i3;->V:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 6
    invoke-virtual {p1}, Lm/b/j/s0;->f()V

    .line 7
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1}, Lm/b/j/s0;->f()V

    .line 9
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 11
    iget-object p1, p1, Lm/b/j/s0;->n:Lm/b/j/j0;

    iget-object p1, p1, Lm/b/j/j0;->b:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 13
    sget-object p2, Lm/b/j/i3;->Y:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 14
    :cond_4
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 15
    iget-object p2, p1, Lm/b/j/s0;->n:Lm/b/j/j0;

    iget-object p2, p2, Lm/b/j/j0;->b:Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    sget-object p2, Lm/b/j/i3;->V:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    :goto_0
    return-void
.end method
