.class public final enum Lm/b/j/p2;
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
    .locals 3

    .line 1
    invoke-virtual {p2}, Lm/b/j/a;->k()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    .line 3
    iget-object p2, p1, Lm/b/j/s0;->m:Lm/b/j/k0;

    iput-boolean v1, p2, Lm/b/j/k0;->f:Z

    .line 4
    invoke-virtual {p1}, Lm/b/j/s0;->g()V

    .line 5
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    return-void

    :cond_0
    const/4 v0, 0x5

    new-array v0, v0, [C

    .line 6
    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, Lm/b/j/a;->c([C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p2}, Lm/b/j/a;->a()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x3e

    .line 8
    invoke-virtual {p2, v0}, Lm/b/j/a;->b(C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {p1}, Lm/b/j/s0;->g()V

    .line 10
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    :cond_2
    const-string v0, "PUBLIC"

    .line 11
    invoke-virtual {p2, v0}, Lm/b/j/a;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 12
    iget-object p2, p1, Lm/b/j/s0;->m:Lm/b/j/k0;

    iput-object v0, p2, Lm/b/j/k0;->c:Ljava/lang/String;

    .line 13
    sget-object p2, Lm/b/j/i3;->d0:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    :cond_3
    const-string v0, "SYSTEM"

    .line 14
    invoke-virtual {p2, v0}, Lm/b/j/a;->d(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 15
    iget-object p2, p1, Lm/b/j/s0;->m:Lm/b/j/k0;

    iput-object v0, p2, Lm/b/j/k0;->c:Ljava/lang/String;

    .line 16
    sget-object p2, Lm/b/j/i3;->j0:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 17
    :cond_4
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 18
    iget-object p2, p1, Lm/b/j/s0;->m:Lm/b/j/k0;

    iput-boolean v1, p2, Lm/b/j/k0;->f:Z

    .line 19
    sget-object p2, Lm/b/j/i3;->o0:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
    .end array-data
.end method
