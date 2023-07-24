.class public final enum Lm/b/j/h3;
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
    .locals 1

    .line 1
    invoke-virtual {p2}, Lm/b/j/a;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->b(Lm/b/j/i3;)V

    const-string p2, "</"

    .line 3
    invoke-virtual {p1, p2}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    .line 4
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lm/b/j/a;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Z)Lm/b/j/o0;

    .line 7
    sget-object p2, Lm/b/j/i3;->k:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x3e

    .line 8
    invoke-virtual {p2, v0}, Lm/b/j/a;->b(C)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 9
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 10
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 12
    sget-object p2, Lm/b/j/i3;->R:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    :goto_0
    return-void
.end method
