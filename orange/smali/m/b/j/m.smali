.class public final enum Lm/b/j/m;
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
    .locals 8

    .line 1
    invoke-static {p1}, Lm/b/j/b0;->a(Lm/b/j/q0;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lm/b/j/q0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p1}, Lm/b/j/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p1}, Lm/b/j/q0;->c()Lm/b/j/k0;

    move-result-object p1

    .line 6
    new-instance v0, Lm/b/i/j;

    iget-object v2, p2, Lm/b/j/j3;->h:Lm/b/j/e0;

    .line 7
    invoke-virtual {p1}, Lm/b/j/k0;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm/b/j/e0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lm/b/j/k0;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lm/b/j/k0;->p()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lm/b/j/k0;->q()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lm/b/j/b;->j()Ljava/lang/String;

    move-result-object v7

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lm/b/i/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lm/b/j/b;->k()Lm/b/i/i;

    move-result-object v2

    invoke-virtual {v2, v0}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    .line 9
    invoke-virtual {p1}, Lm/b/j/k0;->r()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p2}, Lm/b/j/b;->k()Lm/b/i/i;

    move-result-object p1

    sget-object v0, Lm/b/i/h;->c:Lm/b/i/h;

    invoke-virtual {p1, v0}, Lm/b/i/i;->a(Lm/b/i/h;)Lm/b/i/i;

    .line 11
    :cond_2
    sget-object p1, Lm/b/j/b0;->c:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    :goto_0
    return v1

    .line 12
    :cond_3
    sget-object v0, Lm/b/j/b0;->c:Lm/b/j/b0;

    invoke-virtual {p2, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    .line 13
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method
