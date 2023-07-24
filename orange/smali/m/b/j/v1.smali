.class public final enum Lm/b/j/v1;
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

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x20

    if-eq v0, v1, :cond_4

    const/16 v1, 0x22

    if-eq v0, v1, :cond_2

    const/16 v1, 0x27

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_4

    const/16 v1, 0xa

    if-eq v0, v1, :cond_4

    const/16 v1, 0xc

    if-eq v0, v1, :cond_4

    const/16 v1, 0xd

    if-eq v0, v1, :cond_4

    packed-switch v0, :pswitch_data_0

    .line 2
    iget-object v0, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v0}, Lm/b/j/o0;->s()V

    .line 3
    invoke-virtual {p2}, Lm/b/j/a;->q()V

    .line 4
    sget-object p2, Lm/b/j/i3;->J:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 5
    :pswitch_0
    invoke-virtual {p1}, Lm/b/j/s0;->h()V

    .line 6
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 7
    :pswitch_1
    sget-object p2, Lm/b/j/i3;->L:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 9
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 10
    :cond_1
    sget-object p2, Lm/b/j/i3;->Q:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 11
    :cond_2
    :pswitch_2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 12
    iget-object p2, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p2}, Lm/b/j/o0;->s()V

    .line 13
    iget-object p2, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p2, v0}, Lm/b/j/o0;->a(C)V

    .line 14
    sget-object p2, Lm/b/j/i3;->J:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 15
    :cond_3
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 16
    iget-object p2, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Lm/b/j/o0;->a(C)V

    .line 17
    sget-object p2, Lm/b/j/i3;->J:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    :cond_4
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
