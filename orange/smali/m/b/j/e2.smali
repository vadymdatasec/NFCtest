.class public final enum Lm/b/j/e2;
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

    const-string v0, "--"

    .line 1
    invoke-virtual {p2, v0}, Lm/b/j/a;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lm/b/j/s0;->c()V

    .line 3
    sget-object p2, Lm/b/j/i3;->T:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    :cond_0
    const-string v0, "DOCTYPE"

    .line 4
    invoke-virtual {p2, v0}, Lm/b/j/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sget-object p2, Lm/b/j/i3;->Z:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    :cond_1
    const-string v0, "[CDATA["

    .line 6
    invoke-virtual {p2, v0}, Lm/b/j/a;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 7
    sget-object p2, Lm/b/j/i3;->p0:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p1, p0}, Lm/b/j/s0;->c(Lm/b/j/i3;)V

    .line 9
    sget-object p2, Lm/b/j/i3;->R:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    :goto_0
    return-void
.end method
