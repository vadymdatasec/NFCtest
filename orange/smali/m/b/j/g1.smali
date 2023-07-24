.class public final enum Lm/b/j/g1;
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
    invoke-virtual {p2}, Lm/b/j/a;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 3
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Lm/b/j/a;->j()C

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const/4 v0, 0x3

    new-array v0, v0, [C

    .line 5
    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, Lm/b/j/a;->a([C)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    sget-object p2, Lm/b/j/i3;->z:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p1, v1}, Lm/b/j/s0;->a(C)V

    .line 9
    sget-object p2, Lm/b/j/i3;->x:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 11
    invoke-virtual {p2}, Lm/b/j/a;->a()V

    const p2, 0xfffd

    .line 12
    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(C)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 2
        0x2ds
        0x3cs
        0x0s
    .end array-data
.end method
