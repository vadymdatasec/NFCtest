.class public Lm/b/i/d;
.super Lm/b/i/t;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lm/b/i/t;-><init>(Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lm/b/i/t;->d:Lm/b/i/b;

    const-string v0, "comment"

    invoke-virtual {p2, v0, p1}, Lm/b/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lm/b/i/g;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lm/b/i/t;->a(Ljava/lang/Appendable;ILm/b/i/g;)V

    :cond_0
    const-string p2, "<!--"

    .line 3
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, Lm/b/i/d;->r()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, "-->"

    .line 5
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public c(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 0

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "#comment"

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    const-string v1, "comment"

    invoke-virtual {v0, v1}, Lm/b/i/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/t;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
