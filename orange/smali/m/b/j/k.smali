.class public final enum Lm/b/j/k;
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
    .locals 3

    .line 1
    invoke-static {p1}, Lm/b/j/b0;->a(Lm/b/j/q0;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lm/b/j/q0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p1}, Lm/b/j/q0;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v1

    .line 7
    :cond_2
    invoke-virtual {p1}, Lm/b/j/q0;->k()Z

    move-result v0

    const-string v2, "html"

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1

    .line 9
    :cond_3
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 10
    invoke-virtual {p2}, Lm/b/j/b;->r()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v1

    .line 12
    :cond_4
    sget-object p1, Lm/b/j/b0;->v:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_0

    .line 13
    :cond_5
    invoke-virtual {p1}, Lm/b/j/q0;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 14
    :cond_6
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 15
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    .line 16
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method
