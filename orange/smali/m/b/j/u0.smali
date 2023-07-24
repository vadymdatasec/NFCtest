.class public final enum Lm/b/j/u0;
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

    const/16 v0, 0x2f

    .line 1
    invoke-virtual {p2, v0}, Lm/b/j/a;->b(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lm/b/j/s0;->e()V

    .line 3
    sget-object p2, Lm/b/j/i3;->m:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lm/b/j/a;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lm/b/j/s0;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "</"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lm/b/j/s0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lm/b/j/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Lm/b/j/s0;->a(Z)Lm/b/j/o0;

    move-result-object v0

    invoke-virtual {p1}, Lm/b/j/s0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;

    iput-object v0, p1, Lm/b/j/s0;->i:Lm/b/j/o0;

    .line 6
    invoke-virtual {p1}, Lm/b/j/s0;->h()V

    .line 7
    invoke-virtual {p2}, Lm/b/j/a;->q()V

    .line 8
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    :cond_1
    const-string p2, "<"

    .line 9
    invoke-virtual {p1, p2}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    .line 10
    sget-object p2, Lm/b/j/i3;->d:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    :goto_0
    return-void
.end method
