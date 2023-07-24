.class public final enum Lm/b/j/y;
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
    .locals 1

    .line 1
    invoke-virtual {p1}, Lm/b/j/q0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lm/b/j/q0;->a()Lm/b/j/i0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/i0;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lm/b/j/q0;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 5
    invoke-virtual {p2}, Lm/b/j/b;->w()Lm/b/i/l;

    .line 6
    invoke-virtual {p2}, Lm/b/j/b;->v()Lm/b/j/b0;

    move-result-object v0

    invoke-virtual {p2, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    .line 7
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 8
    :cond_1
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p2}, Lm/b/j/b;->w()Lm/b/i/l;

    .line 10
    invoke-virtual {p2}, Lm/b/j/b;->v()Lm/b/j/b0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
