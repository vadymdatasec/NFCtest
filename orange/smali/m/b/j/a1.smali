.class public final enum Lm/b/j/a1;
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

    const/16 v1, 0x21

    if-eq v0, v1, :cond_1

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_0

    const-string v0, "<"

    .line 2
    invoke-virtual {p1, v0}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lm/b/j/a;->q()V

    .line 4
    sget-object p2, Lm/b/j/i3;->g:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lm/b/j/s0;->e()V

    .line 6
    sget-object p2, Lm/b/j/i3;->s:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    :cond_1
    const-string p2, "<!"

    .line 7
    invoke-virtual {p1, p2}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    .line 8
    sget-object p2, Lm/b/j/i3;->u:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    :goto_0
    return-void
.end method
