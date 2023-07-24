.class public final enum Lm/b/j/a2;
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
    invoke-static {}, Lm/b/j/i3;->a()[C

    move-result-object v0

    invoke-virtual {p2, v0}, Lm/b/j/a;->b([C)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    iget-object v1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v1, v0}, Lm/b/j/o0;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result p2

    if-eqz p2, :cond_6

    const/16 v0, 0x20

    if-eq p2, v0, :cond_5

    const/16 v0, 0x22

    if-eq p2, v0, :cond_4

    const/16 v0, 0x60

    if-eq p2, v0, :cond_4

    const v0, 0xffff

    if-eq p2, v0, :cond_3

    const/16 v0, 0x9

    if-eq p2, v0, :cond_5

    const/16 v0, 0xa

    if-eq p2, v0, :cond_5

    const/16 v0, 0xc

    if-eq p2, v0, :cond_5

    const/16 v0, 0xd

    if-eq p2, v0, :cond_5

    const/16 v0, 0x26

    if-eq p2, v0, :cond_1

    const/16 v0, 0x27

    if-eq p2, v0, :cond_4

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 5
    :pswitch_0
    invoke-virtual {p1}, Lm/b/j/s0;->h()V

    .line 6
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x3e

    .line 7
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v1}, Lm/b/j/s0;->a(Ljava/lang/Character;Z)[I

    move-result-object p2

    if-eqz p2, :cond_2

    .line 8
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p1, p2}, Lm/b/j/o0;->a([I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p1, v0}, Lm/b/j/o0;->b(C)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 11
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 12
    :cond_4
    :pswitch_1
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 13
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p1, p2}, Lm/b/j/o0;->b(C)V

    goto :goto_0

    .line 14
    :cond_5
    sget-object p2, Lm/b/j/i3;->I:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 15
    :cond_6
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 16
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Lm/b/j/o0;->b(C)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
