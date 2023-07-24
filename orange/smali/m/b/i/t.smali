.class public abstract Lm/b/i/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/b/i/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Lm/b/i/t;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/b/i/t;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lm/b/i/b;

.field public e:Ljava/lang/String;

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lm/b/i/t;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Lm/b/i/t;->g:Ljava/util/List;

    iput-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 7
    new-instance v0, Lm/b/i/b;

    invoke-direct {v0}, Lm/b/i/b;-><init>()V

    invoke-direct {p0, p1, v0}, Lm/b/i/t;-><init>(Ljava/lang/String;Lm/b/i/b;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lm/b/i/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 3
    invoke-static {p2}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 4
    sget-object v0, Lm/b/i/t;->g:Ljava/util/List;

    iput-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/b/i/t;->e:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lm/b/i/t;->d:Lm/b/i/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 3
    invoke-static {p1}, Lm/b/h/j;->b(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1}, Lm/b/i/t;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Lm/b/i/t;->e:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lm/b/h/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a()Lm/b/i/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    return-object v0
.end method

.method public a(I)Lm/b/i/t;
    .locals 1

    .line 6
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/b/i/t;

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;
    .locals 1

    .line 2
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    invoke-virtual {v0, p1, p2}, Lm/b/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Lm/b/i/t;)Lm/b/i/t;
    .locals 4

    .line 7
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    invoke-static {v0}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    iget v1, p0, Lm/b/i/t;->f:I

    const/4 v2, 0x1

    new-array v2, v2, [Lm/b/i/t;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lm/b/i/t;->a(I[Lm/b/i/t;)V

    return-object p0
.end method

.method public a(Lm/b/k/s0;)Lm/b/i/t;
    .locals 1

    .line 17
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 18
    new-instance v0, Lm/b/k/r0;

    invoke-direct {v0, p1}, Lm/b/k/r0;-><init>(Lm/b/k/s0;)V

    .line 19
    invoke-virtual {v0, p0}, Lm/b/k/r0;->a(Lm/b/i/t;)V

    return-object p0
.end method

.method public varargs a(I[Lm/b/i/t;)V
    .locals 3

    .line 10
    invoke-static {p2}, Lm/b/h/j;->a([Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lm/b/i/t;->f()V

    .line 12
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 13
    aget-object v1, p2, v0

    .line 14
    invoke-virtual {p0, v1}, Lm/b/i/t;->d(Lm/b/i/t;)V

    .line 15
    iget-object v2, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v2, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 16
    invoke-virtual {p0, p1}, Lm/b/i/t;->b(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Appendable;)V
    .locals 3

    .line 20
    new-instance v0, Lm/b/k/r0;

    new-instance v1, Lm/b/i/s;

    invoke-virtual {p0}, Lm/b/i/t;->g()Lm/b/i/g;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lm/b/i/s;-><init>(Ljava/lang/Appendable;Lm/b/i/g;)V

    invoke-direct {v0, v1}, Lm/b/k/r0;-><init>(Lm/b/k/s0;)V

    invoke-virtual {v0, p0}, Lm/b/k/r0;->a(Lm/b/i/t;)V

    return-void
.end method

.method public a(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "\n"

    .line 21
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    invoke-virtual {p3}, Lm/b/i/g;->e()I

    move-result p3

    mul-int p2, p2, p3

    invoke-static {p2}, Lm/b/h/i;->b(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lm/b/i/t;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    invoke-virtual {v0, p1}, Lm/b/i/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    return-object v0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "abs:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/i/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method public b(Lm/b/i/t;)Lm/b/i/t;
    .locals 3

    .line 9
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/t;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    iput-object p1, v0, Lm/b/i/t;->b:Lm/b/i/t;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 11
    :cond_0
    iget p1, p0, Lm/b/i/t;->f:I

    :goto_0
    iput p1, v0, Lm/b/i/t;->f:I

    .line 12
    iget-object p1, p0, Lm/b/i/t;->d:Lm/b/i/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lm/b/i/b;->clone()Lm/b/i/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, v0, Lm/b/i/t;->d:Lm/b/i/b;

    .line 13
    iget-object p1, p0, Lm/b/i/t;->e:Ljava/lang/String;

    iput-object p1, v0, Lm/b/i/t;->e:Ljava/lang/String;

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    iget-object v1, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, v0, Lm/b/i/t;->c:Ljava/util/List;

    .line 15
    iget-object p1, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/t;

    .line 16
    iget-object v2, v0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    return-object v0

    :catch_0
    move-exception p1

    .line 17
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b(I)V
    .locals 1

    .line 7
    :goto_0
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 8
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/t;

    invoke-virtual {v0, p1}, Lm/b/i/t;->c(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract b(Ljava/lang/Appendable;ILm/b/i/g;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public c(I)V
    .locals 0

    .line 11
    iput p1, p0, Lm/b/i/t;->f:I

    return-void
.end method

.method public abstract c(Ljava/lang/Appendable;ILm/b/i/g;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public c(Lm/b/i/t;)V
    .locals 2

    .line 6
    iget-object v0, p1, Lm/b/i/t;->b:Lm/b/i/t;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lm/b/h/j;->b(Z)V

    .line 7
    iget v0, p1, Lm/b/i/t;->f:I

    .line 8
    iget-object v1, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 9
    invoke-virtual {p0, v0}, Lm/b/i/t;->b(I)V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p1, Lm/b/i/t;->b:Lm/b/i/t;

    return-void
.end method

.method public c(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    const-string v0, "abs:"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lm/b/i/t;->d:Lm/b/i/b;

    invoke-virtual {v1, v0}, Lm/b/i/b;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lm/b/i/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    invoke-virtual {v0, p1}, Lm/b/i/b;->d(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/b/i/t;->clone()Lm/b/i/t;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lm/b/i/t;
    .locals 6

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lm/b/i/t;->b(Lm/b/i/t;)Lm/b/i/t;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 4
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_0
    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/t;

    const/4 v3, 0x0

    .line 7
    :goto_0
    iget-object v4, v2, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 8
    iget-object v4, v2, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm/b/i/t;

    invoke-virtual {v4, v2}, Lm/b/i/t;->b(Lm/b/i/t;)Lm/b/i/t;

    move-result-object v4

    .line 9
    iget-object v5, v2, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v5, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 3
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lm/b/i/r;

    invoke-direct {v0, p0, p1}, Lm/b/i/r;-><init>(Lm/b/i/t;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lm/b/i/t;->a(Lm/b/k/s0;)Lm/b/i/t;

    return-void
.end method

.method public d(Lm/b/i/t;)V
    .locals 1

    .line 4
    iget-object v0, p1, Lm/b/i/t;->b:Lm/b/i/t;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lm/b/i/t;->c(Lm/b/i/t;)V

    .line 6
    :cond_0
    invoke-virtual {p1, p0}, Lm/b/i/t;->e(Lm/b/i/t;)V

    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/b/i/t;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Lm/b/i/t;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lm/b/i/t;->c(Lm/b/i/t;)V

    .line 4
    :cond_0
    iput-object p1, p0, Lm/b/i/t;->b:Lm/b/i/t;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    sget-object v1, Lm/b/i/t;->g:Ljava/util/List;

    if-ne v0, v1, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lm/b/i/t;->c:Ljava/util/List;

    :cond_0
    return-void
.end method

.method public g()Lm/b/i/g;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm/b/i/t;->k()Lm/b/i/i;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lm/b/i/i;

    const-string v1, ""

    invoke-direct {v0, v1}, Lm/b/i/i;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Lm/b/i/i;->E()Lm/b/i/g;

    move-result-object v0

    return-object v0
.end method

.method public h()Lm/b/i/t;
    .locals 4

    .line 1
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget-object v0, v0, Lm/b/i/t;->c:Ljava/util/List;

    .line 3
    iget v2, p0, Lm/b/i/t;->f:I

    add-int/lit8 v2, v2, 0x1

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_1

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/t;

    return-object v0

    :cond_1
    return-object v1
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public j()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2
    invoke-virtual {p0, v0}, Lm/b/i/t;->a(Ljava/lang/Appendable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Lm/b/i/i;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm/b/i/t;->o()Lm/b/i/t;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lm/b/i/i;

    if-eqz v1, :cond_0

    check-cast v0, Lm/b/i/i;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public l()Lm/b/i/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    return-object v0
.end method

.method public final m()Lm/b/i/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    return-object v0
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    invoke-static {v0}, Lm/b/h/j;->a(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    invoke-virtual {v0, p0}, Lm/b/i/t;->c(Lm/b/i/t;)V

    return-void
.end method

.method public o()Lm/b/i/t;
    .locals 2

    move-object v0, p0

    .line 1
    :goto_0
    iget-object v1, v0, Lm/b/i/t;->b:Lm/b/i/t;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lm/b/i/t;->f:I

    return v0
.end method

.method public q()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/b/i/t;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, v0, Lm/b/i/t;->c:Ljava/util/List;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

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

    check-cast v2, Lm/b/i/t;

    if-eq v2, p0, :cond_1

    .line 6
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/t;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
