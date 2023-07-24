.class public final enum Lm/b/j/w0;
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
    invoke-virtual {p2}, Lm/b/j/a;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lm/b/j/a;->f()Ljava/lang/String;

    move-result-object p2

    .line 3
    iget-object v0, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v0, p2}, Lm/b/j/o0;->c(Ljava/lang/String;)V

    .line 4
    iget-object p1, p1, Lm/b/j/s0;->h:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 5
    :cond_0
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_5

    const/16 v1, 0xc

    if-eq v0, v1, :cond_5

    const/16 v1, 0xd

    if-eq v0, v1, :cond_5

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_3

    const/16 v1, 0x3e

    if-eq v0, v1, :cond_1

    .line 6
    invoke-virtual {p0, p1, p2}, Lm/b/j/w0;->b(Lm/b/j/s0;Lm/b/j/a;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p1}, Lm/b/j/s0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p1}, Lm/b/j/s0;->h()V

    .line 9
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0, p1, p2}, Lm/b/j/w0;->b(Lm/b/j/s0;Lm/b/j/a;)V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p1}, Lm/b/j/s0;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12
    sget-object p2, Lm/b/j/i3;->Q:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 13
    :cond_4
    invoke-virtual {p0, p1, p2}, Lm/b/j/w0;->b(Lm/b/j/s0;Lm/b/j/a;)V

    goto :goto_0

    .line 14
    :cond_5
    invoke-virtual {p1}, Lm/b/j/s0;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15
    sget-object p2, Lm/b/j/i3;->I:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 16
    :cond_6
    invoke-virtual {p0, p1, p2}, Lm/b/j/w0;->b(Lm/b/j/s0;Lm/b/j/a;)V

    :goto_0
    return-void
.end method

.method public final b(Lm/b/j/s0;Lm/b/j/a;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "</"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lm/b/j/s0;->h:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lm/b/j/a;->q()V

    .line 3
    sget-object p2, Lm/b/j/i3;->d:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    return-void
.end method
