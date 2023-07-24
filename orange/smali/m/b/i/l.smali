.class public Lm/b/i/l;
.super Lm/b/i/t;
.source "SourceFile"


# instance fields
.field public h:Lm/b/j/g0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\s+"

    .line 1
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lm/b/j/g0;Ljava/lang/String;)V
    .locals 1

    .line 4
    new-instance v0, Lm/b/i/b;

    invoke-direct {v0}, Lm/b/i/b;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V

    return-void
.end method

.method public constructor <init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lm/b/i/t;-><init>(Ljava/lang/String;Lm/b/i/b;)V

    .line 2
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 3
    iput-object p1, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    return-void
.end method

.method public static a(Lm/b/i/l;Ljava/util/List;)Ljava/lang/Integer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Lm/b/i/l;",
            ">(",
            "Lm/b/i/l;",
            "Ljava/util/List<",
            "TE;>;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 6
    invoke-static {p0}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 7
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    if-ne v1, p0, :cond_0

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic a(Lm/b/i/l;)Lm/b/j/g0;
    .locals 0

    .line 2
    iget-object p0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/StringBuilder;Lm/b/i/u;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm/b/i/l;->b(Ljava/lang/StringBuilder;Lm/b/i/u;)V

    return-void
.end method

.method public static a(Lm/b/i/l;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 11
    iget-object p0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {p0}, Lm/b/j/g0;->b()Ljava/lang/String;

    move-result-object p0

    const-string v0, "br"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lm/b/i/u;->a(Ljava/lang/StringBuilder;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, " "

    .line 12
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/StringBuilder;Lm/b/i/u;)V
    .locals 1

    .line 7
    invoke-virtual {p1}, Lm/b/i/u;->s()Ljava/lang/String;

    move-result-object v0

    .line 8
    iget-object p1, p1, Lm/b/i/t;->b:Lm/b/i/t;

    invoke-static {p1}, Lm/b/i/l;->g(Lm/b/i/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p0}, Lm/b/i/u;->a(Ljava/lang/StringBuilder;)Z

    move-result p1

    invoke-static {p0, v0, p1}, Lm/b/h/i;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method public static g(Lm/b/i/t;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 2
    instance-of v1, p0, Lm/b/i/l;

    if-eqz v1, :cond_1

    .line 3
    check-cast p0, Lm/b/i/l;

    .line 4
    iget-object v1, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {v1}, Lm/b/j/g0;->h()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object p0

    iget-object p0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {p0}, Lm/b/j/g0;->h()Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public A()Lm/b/k/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm/b/k/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/b/k/f;-><init>(I)V

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->r()Lm/b/k/f;

    move-result-object v0

    .line 4
    new-instance v1, Lm/b/k/f;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v1, v2}, Lm/b/k/f;-><init>(I)V

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    if-eq v2, p0, :cond_1

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public B()Lm/b/j/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {v0}, Lm/b/j/g0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    new-instance v1, Lm/b/k/r0;

    new-instance v2, Lm/b/i/k;

    invoke-direct {v2, p0, v0}, Lm/b/i/k;-><init>(Lm/b/i/l;Ljava/lang/StringBuilder;)V

    invoke-direct {v1, v2}, Lm/b/k/r0;-><init>(Lm/b/k/s0;)V

    .line 3
    invoke-virtual {v1, p0}, Lm/b/k/r0;->a(Lm/b/i/t;)V

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/l;
    .locals 0

    .line 4
    invoke-super {p0, p1, p2}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;

    return-object p0
.end method

.method public a(Lm/b/i/t;)Lm/b/i/l;
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lm/b/i/t;->a(Lm/b/i/t;)Lm/b/i/t;

    move-object p1, p0

    check-cast p1, Lm/b/i/l;

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lm/b/i/l;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/l;

    return-object p0
.end method

.method public final a(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 13
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/t;

    .line 14
    invoke-virtual {v1, p1}, Lm/b/i/t;->a(Ljava/lang/Appendable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    invoke-virtual {p3}, Lm/b/i/g;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {v0}, Lm/b/j/g0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/g0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p3}, Lm/b/i/g;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    :cond_1
    instance-of v0, p1, Ljava/lang/StringBuilder;

    if-eqz v0, :cond_2

    .line 13
    move-object v0, p1

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 14
    invoke-virtual {p0, p1, p2, p3}, Lm/b/i/t;->a(Ljava/lang/Appendable;ILm/b/i/g;)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lm/b/i/t;->a(Ljava/lang/Appendable;ILm/b/i/g;)V

    :cond_3
    :goto_0
    const-string p2, "<"

    .line 16
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    .line 17
    invoke-virtual {p0}, Lm/b/i/l;->C()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 18
    iget-object p2, p0, Lm/b/i/t;->d:Lm/b/i/b;

    invoke-virtual {p2, p1, p3}, Lm/b/i/b;->a(Ljava/lang/Appendable;Lm/b/i/g;)V

    .line 19
    iget-object p2, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {p2}, Lm/b/j/g0;->g()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 20
    invoke-virtual {p3}, Lm/b/i/g;->h()Lm/b/i/f;

    move-result-object p2

    sget-object p3, Lm/b/i/f;->b:Lm/b/i/f;

    if-ne p2, p3, :cond_4

    iget-object p2, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {p2}, Lm/b/j/g0;->d()Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x3e

    .line 21
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :cond_4
    const-string p2, " />"

    .line 22
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    :cond_5
    const-string p2, ">"

    .line 23
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_1
    return-void
.end method

.method public final b(Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/t;

    .line 2
    instance-of v2, v1, Lm/b/i/u;

    if-eqz v2, :cond_1

    .line 3
    check-cast v1, Lm/b/i/u;

    .line 4
    invoke-static {p1, v1}, Lm/b/i/l;->b(Ljava/lang/StringBuilder;Lm/b/i/u;)V

    goto :goto_0

    .line 5
    :cond_1
    instance-of v2, v1, Lm/b/i/l;

    if-eqz v2, :cond_0

    .line 6
    check-cast v1, Lm/b/i/l;

    invoke-static {v1, p1}, Lm/b/i/l;->a(Lm/b/i/l;Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {v0}, Lm/b/j/g0;->g()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    :cond_0
    invoke-virtual {p3}, Lm/b/i/g;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    .line 3
    invoke-virtual {v0}, Lm/b/j/g0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Lm/b/i/g;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lm/b/i/u;

    if-nez v0, :cond_2

    .line 4
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lm/b/i/t;->a(Ljava/lang/Appendable;ILm/b/i/g;)V

    :cond_2
    const-string p2, "</"

    .line 5
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    invoke-virtual {p0}, Lm/b/i/l;->C()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, ">"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_3
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/b/i/l;->clone()Lm/b/i/l;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lm/b/i/l;
    .locals 1

    .line 3
    invoke-super {p0}, Lm/b/i/t;->clone()Lm/b/i/t;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    return-object v0
.end method

.method public bridge synthetic clone()Lm/b/i/t;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lm/b/i/l;->clone()Lm/b/i/l;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Lm/b/i/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/l;->r()Lm/b/k/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/b/i/l;

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lm/b/k/f;
    .locals 1

    .line 1
    new-instance v0, Lm/b/k/s;

    invoke-direct {v0, p1}, Lm/b/k/s;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p0}, Lm/b/k/b;->a(Lm/b/k/q0;Lm/b/i/l;)Lm/b/k/f;

    move-result-object p1

    return-object p1
.end method

.method public f(Lm/b/i/t;)Lm/b/i/l;
    .locals 1

    .line 1
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0, p1}, Lm/b/i/t;->d(Lm/b/i/t;)V

    .line 3
    invoke-virtual {p0}, Lm/b/i/t;->f()V

    .line 4
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lm/b/i/t;->c(I)V

    return-object p0
.end method

.method public f(Ljava/lang/String;)Z
    .locals 13

    .line 6
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    const-string v1, "class"

    invoke-virtual {v0, v1}, Lm/b/i/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x0

    if-eqz v1, :cond_6

    if-ge v1, v8, :cond_0

    goto :goto_2

    :cond_0
    if-ne v1, v8, :cond_1

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v1, :cond_5

    .line 10
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    const/4 v12, 0x1

    if-eqz v3, :cond_3

    if-eqz v2, :cond_4

    sub-int v2, v11, v10

    if-ne v2, v8, :cond_2

    const/4 v3, 0x1

    const/4 v6, 0x0

    move-object v2, v0

    move v4, v10

    move-object v5, p1

    move v7, v8

    .line 11
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_2

    return v12

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    if-nez v2, :cond_4

    move v10, v11

    const/4 v2, 0x1

    :cond_4
    :goto_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_5
    if-eqz v2, :cond_6

    sub-int/2addr v1, v10

    if-ne v1, v8, :cond_6

    const/4 v3, 0x1

    const/4 v6, 0x0

    move-object v2, v0

    move v4, v10

    move-object v5, p1

    move v7, v8

    .line 12
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    return p1

    :cond_6
    :goto_2
    return v9
.end method

.method public g(Ljava/lang/String;)Lm/b/k/f;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lorg/jsoup/select/Selector;->a(Ljava/lang/String;Lm/b/i/l;)Lm/b/k/f;

    move-result-object p1

    return-object p1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {v0}, Lm/b/j/g0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lm/b/i/l;
    .locals 1

    .line 2
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    check-cast v0, Lm/b/i/l;

    return-object v0
.end method

.method public bridge synthetic l()Lm/b/i/t;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v0

    return-object v0
.end method

.method public r()Lm/b/k/f;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    iget-object v1, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/t;

    .line 3
    instance-of v3, v2, Lm/b/i/l;

    if-eqz v3, :cond_0

    .line 4
    check-cast v2, Lm/b/i/l;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_1
    new-instance v1, Lm/b/k/f;

    invoke-direct {v1, v0}, Lm/b/k/f;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method public s()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    iget-object v1, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/t;

    .line 3
    instance-of v3, v2, Lm/b/i/e;

    if-eqz v3, :cond_1

    .line 4
    check-cast v2, Lm/b/i/e;

    .line 5
    invoke-virtual {v2}, Lm/b/i/e;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 6
    :cond_1
    instance-of v3, v2, Lm/b/i/d;

    if-eqz v3, :cond_2

    .line 7
    check-cast v2, Lm/b/i/d;

    .line 8
    invoke-virtual {v2}, Lm/b/i/d;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 9
    :cond_2
    instance-of v3, v2, Lm/b/i/l;

    if-eqz v3, :cond_0

    .line 10
    check-cast v2, Lm/b/i/l;

    .line 11
    invoke-virtual {v2}, Lm/b/i/l;->s()Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public t()Ljava/lang/Integer;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->r()Lm/b/k/f;

    move-result-object v0

    invoke-static {p0, v0}, Lm/b/i/l;->a(Lm/b/i/l;Ljava/util/List;)Ljava/lang/Integer;

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

.method public u()Lm/b/k/f;
    .locals 1

    .line 1
    new-instance v0, Lm/b/k/g;

    invoke-direct {v0}, Lm/b/k/g;-><init>()V

    invoke-static {v0, p0}, Lm/b/k/b;->a(Lm/b/k/q0;Lm/b/i/l;)Lm/b/k/f;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {p0, v0}, Lm/b/i/l;->a(Ljava/lang/StringBuilder;)V

    .line 3
    invoke-virtual {p0}, Lm/b/i/t;->g()Lm/b/i/g;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/g;->g()Z

    move-result v1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    const-string v1, "id"

    invoke-virtual {v0, v1}, Lm/b/i/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/l;->h:Lm/b/j/g0;

    invoke-virtual {v0}, Lm/b/j/g0;->c()Z

    move-result v0

    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {p0, v0}, Lm/b/i/l;->b(Ljava/lang/StringBuilder;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z()Lm/b/i/l;
    .locals 4

    .line 1
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->r()Lm/b/k/f;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lm/b/i/l;->a(Lm/b/i/l;Ljava/util/List;)Ljava/lang/Integer;

    move-result-object v2

    .line 4
    invoke-static {v2}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_1

    .line 6
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    return-object v0

    :cond_1
    return-object v1
.end method
