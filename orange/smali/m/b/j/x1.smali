.class public final enum Lm/b/j/x1;
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
    invoke-static {}, Lm/b/j/i3;->d()[C

    move-result-object v0

    invoke-virtual {p2, v0}, Lm/b/j/a;->a([C)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    iget-object v1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v1, v0}, Lm/b/j/o0;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {v0}, Lm/b/j/o0;->u()V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lm/b/j/a;->b()C

    move-result p2

    if-eqz p2, :cond_5

    const/16 v0, 0x22

    if-eq p2, v0, :cond_4

    const/16 v1, 0x26

    if-eq p2, v1, :cond_2

    const v0, 0xffff

    if-eq p2, v0, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 7
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lm/b/j/s0;->a(Ljava/lang/Character;Z)[I

    move-result-object p2

    if-eqz p2, :cond_3

    .line 9
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p1, p2}, Lm/b/j/o0;->a([I)V

    goto :goto_1

    .line 10
    :cond_3
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p1, v1}, Lm/b/j/o0;->b(C)V

    goto :goto_1

    .line 11
    :cond_4
    sget-object p2, Lm/b/j/i3;->P:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_1

    .line 12
    :cond_5
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 13
    iget-object p1, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Lm/b/j/o0;->b(C)V

    :goto_1
    return-void
.end method
