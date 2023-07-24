.class public final enum Lm/b/j/n2;
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
    .locals 1

    .line 1
    invoke-virtual {p2}, Lm/b/j/a;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lm/b/j/s0;->d()V

    .line 3
    sget-object p2, Lm/b/j/i3;->b0:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result p2

    if-eqz p2, :cond_2

    const/16 v0, 0x20

    if-eq p2, v0, :cond_3

    const v0, 0xffff

    if-eq p2, v0, :cond_1

    const/16 v0, 0x9

    if-eq p2, v0, :cond_3

    const/16 v0, 0xa

    if-eq p2, v0, :cond_3

    const/16 v0, 0xc

    if-eq p2, v0, :cond_3

    const/16 v0, 0xd

    if-eq p2, v0, :cond_3

    .line 5
    invoke-virtual {p1}, Lm/b/j/s0;->d()V

    .line 6
    iget-object v0, p1, Lm/b/j/s0;->m:Lm/b/j/k0;

    iget-object v0, v0, Lm/b/j/k0;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 7
    sget-object p2, Lm/b/j/i3;->b0:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 9
    invoke-virtual {p1}, Lm/b/j/s0;->d()V

    .line 10
    iget-object p2, p1, Lm/b/j/s0;->m:Lm/b/j/k0;

    const/4 v0, 0x1

    iput-boolean v0, p2, Lm/b/j/k0;->f:Z

    .line 11
    invoke-virtual {p1}, Lm/b/j/s0;->g()V

    .line 12
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 14
    invoke-virtual {p1}, Lm/b/j/s0;->d()V

    .line 15
    iget-object p2, p1, Lm/b/j/s0;->m:Lm/b/j/k0;

    iget-object p2, p2, Lm/b/j/k0;->b:Ljava/lang/StringBuilder;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    sget-object p2, Lm/b/j/i3;->b0:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    :cond_3
    :goto_0
    return-void
.end method
