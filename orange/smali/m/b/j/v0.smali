.class public final enum Lm/b/j/v0;
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
    invoke-virtual {p2}, Lm/b/j/a;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lm/b/j/s0;->a(Z)Lm/b/j/o0;

    .line 3
    iget-object v0, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    invoke-virtual {p2}, Lm/b/j/a;->j()C

    move-result v1

    invoke-virtual {v0, v1}, Lm/b/j/o0;->c(C)V

    .line 4
    iget-object v0, p1, Lm/b/j/s0;->h:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lm/b/j/a;->j()C

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 5
    sget-object p2, Lm/b/j/i3;->n:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    :cond_0
    const-string p2, "</"

    .line 6
    invoke-virtual {p1, p2}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    .line 7
    sget-object p2, Lm/b/j/i3;->d:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    :goto_0
    return-void
.end method
