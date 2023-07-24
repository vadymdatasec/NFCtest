.class public Lm/b/i/j;
.super Lm/b/i/t;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p5}, Lm/b/i/t;-><init>(Ljava/lang/String;)V

    const-string p5, "name"

    .line 2
    invoke-virtual {p0, p5, p1}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;

    if-eqz p2, :cond_0

    const-string p1, "pubSysKey"

    .line 3
    invoke-virtual {p0, p1, p2}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;

    :cond_0
    const-string p1, "publicId"

    .line 4
    invoke-virtual {p0, p1, p3}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;

    const-string p1, "systemId"

    .line 5
    invoke-virtual {p0, p1, p4}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;

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

    .line 1
    invoke-virtual {p3}, Lm/b/i/g;->h()Lm/b/i/f;

    move-result-object p2

    sget-object p3, Lm/b/i/f;->b:Lm/b/i/f;

    const-string v0, "systemId"

    const-string v1, "publicId"

    if-ne p2, p3, :cond_0

    invoke-virtual {p0, v1}, Lm/b/i/j;->e(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0, v0}, Lm/b/i/j;->e(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "<!doctype"

    .line 2
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    const-string p2, "<!DOCTYPE"

    .line 3
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_0
    const-string p2, "name"

    .line 4
    invoke-virtual {p0, p2}, Lm/b/i/j;->e(Ljava/lang/String;)Z

    move-result p3

    const-string v2, " "

    if-eqz p3, :cond_1

    .line 5
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    invoke-virtual {p0, p2}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_1
    const-string p2, "pubSysKey"

    .line 6
    invoke-virtual {p0, p2}, Lm/b/i/j;->e(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 7
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    invoke-virtual {p0, p2}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 8
    :cond_2
    invoke-virtual {p0, v1}, Lm/b/i/j;->e(Ljava/lang/String;)Z

    move-result p2

    const/16 p3, 0x22

    const-string v2, " \""

    if-eqz p2, :cond_3

    .line 9
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-virtual {p0, v1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 10
    :cond_3
    invoke-virtual {p0, v0}, Lm/b/i/j;->e(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 11
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-virtual {p0, v0}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_4
    const/16 p2, 0x3e

    .line 12
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public c(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 0

    return-void
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm/b/h/i;->a(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "#doctype"

    return-object v0
.end method
