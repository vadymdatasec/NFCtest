.class public Lm/b/j/l3;
.super Lm/b/j/j3;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/j/j3;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/n0;)Lm/b/i/l;
    .locals 5

    .line 13
    invoke-virtual {p1}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    invoke-static {v0, v1}, Lm/b/j/g0;->a(Ljava/lang/String;Lm/b/j/e0;)Lm/b/j/g0;

    move-result-object v0

    .line 14
    new-instance v1, Lm/b/i/l;

    iget-object v2, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    iget-object v3, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    iget-object v4, p1, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-virtual {v3, v4}, Lm/b/j/e0;->a(Lm/b/i/b;)Lm/b/i/b;

    invoke-direct {v1, v0, v2, v4}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V

    .line 15
    invoke-virtual {p0, v1}, Lm/b/j/l3;->a(Lm/b/i/t;)V

    .line 16
    invoke-virtual {p1}, Lm/b/j/o0;->q()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 17
    iget-object p1, p0, Lm/b/j/j3;->b:Lm/b/j/s0;

    invoke-virtual {p1}, Lm/b/j/s0;->a()V

    .line 18
    invoke-virtual {v0}, Lm/b/j/g0;->f()Z

    move-result p1

    if-nez p1, :cond_1

    .line 19
    invoke-virtual {v0}, Lm/b/j/g0;->i()Lm/b/j/g0;

    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-object v1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lm/b/j/j3;->a(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)V

    .line 2
    iget-object p1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    iget-object p2, p0, Lm/b/j/j3;->c:Lm/b/i/i;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, Lm/b/j/j3;->c:Lm/b/i/i;

    invoke-virtual {p1}, Lm/b/i/i;->E()Lm/b/i/g;

    move-result-object p1

    sget-object p2, Lm/b/i/f;->c:Lm/b/i/f;

    invoke-virtual {p1, p2}, Lm/b/i/g;->a(Lm/b/i/f;)Lm/b/i/g;

    return-void
.end method

.method public final a(Lm/b/i/t;)V
    .locals 1

    .line 12
    invoke-virtual {p0}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    return-void
.end method

.method public a(Lm/b/j/i0;)V
    .locals 2

    .line 30
    new-instance v0, Lm/b/i/u;

    invoke-virtual {p1}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lm/b/i/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0, v0}, Lm/b/j/l3;->a(Lm/b/i/t;)V

    return-void
.end method

.method public a(Lm/b/j/j0;)V
    .locals 6

    .line 21
    new-instance v0, Lm/b/i/d;

    invoke-virtual {p1}, Lm/b/j/j0;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lm/b/i/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-boolean p1, p1, Lm/b/j/j0;->c:Z

    if-eqz p1, :cond_1

    .line 23
    invoke-virtual {v0}, Lm/b/i/d;->r()Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    const-string v1, "!"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "?"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 25
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "<"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {p1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    invoke-static {}, Lm/b/j/f0;->c()Lm/b/j/f0;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lm/b/g;->a(Ljava/lang/String;Ljava/lang/String;Lm/b/j/f0;)Lm/b/i/i;

    move-result-object v2

    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v3}, Lm/b/i/l;->d(I)Lm/b/i/l;

    move-result-object v2

    .line 27
    new-instance v3, Lm/b/i/v;

    iget-object v4, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    invoke-virtual {v2}, Lm/b/i/l;->C()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lm/b/j/e0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lm/b/i/t;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    invoke-direct {v3, v4, v0, p1}, Lm/b/i/v;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    invoke-virtual {v3}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object p1

    invoke-virtual {v2}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm/b/i/b;->a(Lm/b/i/b;)V

    move-object v0, v3

    .line 29
    :cond_1
    invoke-virtual {p0, v0}, Lm/b/j/l3;->a(Lm/b/i/t;)V

    return-void
.end method

.method public a(Lm/b/j/k0;)V
    .locals 7

    .line 32
    new-instance v6, Lm/b/i/j;

    iget-object v0, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    invoke-virtual {p1}, Lm/b/j/k0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/b/j/e0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lm/b/j/k0;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lm/b/j/k0;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lm/b/j/k0;->q()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lm/b/i/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0, v6}, Lm/b/j/l3;->a(Lm/b/i/t;)V

    return-void
.end method

.method public final a(Lm/b/j/m0;)V
    .locals 3

    .line 34
    invoke-virtual {p1}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object p1

    .line 35
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 36
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 37
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_2

    return-void

    .line 38
    :cond_2
    iget-object p1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_2
    if-ltz p1, :cond_4

    .line 39
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    .line 40
    iget-object v2, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    if-ne v0, v1, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method

.method public a(Lm/b/j/q0;)Z
    .locals 2

    .line 4
    sget-object v0, Lm/b/j/k3;->a:[I

    iget-object v1, p1, Lm/b/j/q0;->a:Lm/b/j/p0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected token type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lm/b/j/q0;->a:Lm/b/j/p0;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 6
    :pswitch_0
    invoke-virtual {p1}, Lm/b/j/q0;->c()Lm/b/j/k0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/l3;->a(Lm/b/j/k0;)V

    goto :goto_0

    .line 7
    :pswitch_1
    invoke-virtual {p1}, Lm/b/j/q0;->a()Lm/b/j/i0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/l3;->a(Lm/b/j/i0;)V

    goto :goto_0

    .line 8
    :pswitch_2
    invoke-virtual {p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/l3;->a(Lm/b/j/j0;)V

    goto :goto_0

    .line 9
    :pswitch_3
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/l3;->a(Lm/b/j/m0;)V

    goto :goto_0

    .line 10
    :pswitch_4
    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/l3;->a(Lm/b/j/n0;)Lm/b/i/l;

    :goto_0
    :pswitch_5
    const/4 p1, 0x1

    return p1

    :goto_1
    const/4 p1, 0x0

    .line 11
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method public b()Lm/b/j/e0;
    .locals 1

    .line 1
    sget-object v0, Lm/b/j/e0;->d:Lm/b/j/e0;

    return-object v0
.end method
