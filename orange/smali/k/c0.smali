.class public final Lk/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lk/c0;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lk/c0;
    .locals 4

    const-string v0, ":"

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    add-int/2addr v2, v1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lk/c0;->b(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v2, ""

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lk/c0;->b(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0

    .line 5
    :cond_1
    invoke-virtual {p0, v2, p1}, Lk/c0;->b(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lk/c0;
    .locals 0

    .line 6
    invoke-static {p1}, Lk/d0;->c(Ljava/lang/String;)V

    .line 7
    invoke-static {p2, p1}, Lk/d0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, p1, p2}, Lk/c0;->b(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0
.end method

.method public a()Lk/d0;
    .locals 1

    .line 9
    new-instance v0, Lk/d0;

    invoke-direct {v0, p0}, Lk/d0;-><init>(Lk/c0;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lk/c0;
    .locals 2

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v1, p0, Lk/c0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 4
    iget-object v1, p0, Lk/c0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lk/c0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 6
    iget-object v1, p0, Lk/c0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x2

    :cond_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lk/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/c0;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object p1, p0, Lk/c0;->a:Ljava/util/List;

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lk/c0;
    .locals 0

    .line 1
    invoke-static {p1}, Lk/d0;->c(Ljava/lang/String;)V

    .line 2
    invoke-static {p2, p1}, Lk/d0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Lk/c0;->b(Ljava/lang/String;)Lk/c0;

    .line 4
    invoke-virtual {p0, p1, p2}, Lk/c0;->b(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0
.end method
