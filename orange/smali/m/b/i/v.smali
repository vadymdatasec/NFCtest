.class public Lm/b/i/v;
.super Lm/b/i/t;
.source "SourceFile"


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lm/b/i/t;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 3
    iput-object p1, p0, Lm/b/i/v;->h:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lm/b/i/v;->i:Z

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p2, "<"

    .line 1
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    iget-boolean v0, p0, Lm/b/i/v;->i:Z

    const-string v1, "!"

    const-string v2, "?"

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 2
    :goto_0
    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    iget-object v0, p0, Lm/b/i/v;->h:Ljava/lang/String;

    .line 3
    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 4
    iget-object p2, p0, Lm/b/i/t;->d:Lm/b/i/b;

    invoke-virtual {p2, p1, p3}, Lm/b/i/b;->a(Ljava/lang/Appendable;Lm/b/i/g;)V

    .line 5
    iget-boolean p2, p0, Lm/b/i/v;->i:Z

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    .line 6
    :goto_1
    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, ">"

    .line 7
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public c(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 0

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "#declaration"

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/v;->h:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/t;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
