.class public final enum Lm/b/j/o;
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
    .locals 2

    .line 1
    invoke-virtual {p1}, Lm/b/j/q0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lm/b/j/q0;->h()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Lm/b/j/b0;->a(Lm/b/j/q0;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lm/b/j/q0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v1, "html"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {p1}, Lm/b/j/q0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 5
    :cond_2
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 6
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    .line 7
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 8
    :cond_3
    :goto_1
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1
.end method
