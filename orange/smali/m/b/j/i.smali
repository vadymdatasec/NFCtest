.class public final enum Lm/b/j/i;
.super Lm/b/j/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lm/b/j/b0;-><init>(Ljava/lang/String;ILm/b/j/m;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 7

    .line 1
    sget-object v0, Lm/b/j/r;->a:[I

    iget-object v1, p1, Lm/b/j/q0;->a:Lm/b/j/p0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-string v1, "html"

    const/4 v2, 0x0

    const-string v3, "select"

    const-string v4, "optgroup"

    const-string v5, "option"

    packed-switch v0, :pswitch_data_0

    .line 2
    invoke-virtual {p0, p1, p2}, Lm/b/j/i;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 3
    :pswitch_0
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    .line 4
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    goto/16 :goto_1

    .line 5
    :pswitch_1
    invoke-virtual {p1}, Lm/b/j/q0;->a()Lm/b/j/i0;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lm/b/j/b0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v2

    .line 8
    :cond_0
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/i0;)V

    goto/16 :goto_1

    .line 9
    :pswitch_2
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/i/l;)Lm/b/i/l;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/i/l;)Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 13
    invoke-virtual {p2, v5}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 14
    :cond_1
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 15
    invoke-virtual {p2}, Lm/b/j/b;->w()Lm/b/i/l;

    goto/16 :goto_1

    .line 16
    :cond_2
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    goto/16 :goto_1

    .line 17
    :cond_3
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 18
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 19
    invoke-virtual {p2}, Lm/b/j/b;->w()Lm/b/i/l;

    goto/16 :goto_1

    .line 20
    :cond_4
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    goto/16 :goto_1

    .line 21
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 22
    invoke-virtual {p2, v0}, Lm/b/j/b;->i(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 23
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v2

    .line 24
    :cond_6
    invoke-virtual {p2, v0}, Lm/b/j/b;->m(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Lm/b/j/b;->z()V

    goto/16 :goto_1

    .line 26
    :cond_7
    invoke-virtual {p0, p1, p2}, Lm/b/j/i;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 27
    :pswitch_3
    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v6

    .line 29
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 30
    sget-object p1, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, v0, p1}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1

    .line 31
    :cond_8
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 32
    invoke-virtual {p2, v5}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 33
    invoke-virtual {p2, v0}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_1

    .line 34
    :cond_9
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 35
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 36
    invoke-virtual {p2, v5}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    goto :goto_0

    .line 37
    :cond_a
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 38
    invoke-virtual {p2, v4}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 39
    :cond_b
    :goto_0
    invoke-virtual {p2, v0}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto :goto_1

    .line 40
    :cond_c
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 41
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 42
    invoke-virtual {p2, v3}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_d
    const-string v1, "input"

    const-string v4, "keygen"

    const-string v5, "textarea"

    .line 43
    filled-new-array {v1, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 44
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 45
    invoke-virtual {p2, v3}, Lm/b/j/b;->i(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    .line 46
    :cond_e
    invoke-virtual {p2, v3}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 47
    invoke-virtual {p2, v0}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    :cond_f
    const-string v0, "script"

    .line 48
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 49
    sget-object v0, Lm/b/j/b0;->e:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1

    .line 50
    :cond_10
    invoke-virtual {p0, p1, p2}, Lm/b/j/i;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 51
    :pswitch_4
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v2

    .line 52
    :pswitch_5
    invoke-virtual {p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    :cond_11
    :goto_1
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 0

    .line 1
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    const/4 p1, 0x0

    return p1
.end method
