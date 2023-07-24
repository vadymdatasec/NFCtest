.class public abstract Le/f/b/b/g;
.super Le/f/b/b/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f/b/b/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/e<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field public static final c:Le/f/b/b/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/v0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/f/b/b/f;

    sget-object v1, Le/f/b/b/q0;->f:Le/f/b/b/g;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le/f/b/b/f;-><init>(Le/f/b/b/g;I)V

    sput-object v0, Le/f/b/b/g;->c:Le/f/b/b/v0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/b/b/e;-><init>()V

    return-void
.end method

.method public static a([Ljava/lang/Object;)Le/f/b/b/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 1
    array-length v0, p0

    invoke-static {p0, v0}, Le/f/b/b/g;->b([Ljava/lang/Object;I)Le/f/b/b/g;

    move-result-object p0

    return-object p0
.end method

.method public static varargs b([Ljava/lang/Object;)Le/f/b/b/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Le/f/b/b/o0;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    invoke-static {p0}, Le/f/b/b/g;->a([Ljava/lang/Object;)Le/f/b/b/g;

    move-result-object p0

    return-object p0
.end method

.method public static b([Ljava/lang/Object;I)Le/f/b/b/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "I)",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Le/f/b/b/g;->of()Le/f/b/b/g;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Le/f/b/b/q0;

    invoke-direct {v0, p0, p1}, Le/f/b/b/q0;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static of()Le/f/b/b/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/b/b/q0;->f:Le/f/b/b/g;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Le/f/b/b/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    .line 2
    invoke-static {v0}, Le/f/b/b/g;->b([Ljava/lang/Object;)Le/f/b/b/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a([Ljava/lang/Object;I)I
    .locals 4

    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p2, v1

    .line 4
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p2, v0

    return p2
.end method

.method public a(II)Le/f/b/b/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/f/b/b/g$a;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2}, Le/f/b/b/g$a;-><init>(Le/f/b/b/g;II)V

    return-object v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/b/b/g;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le/f/b/b/k;->a(Ljava/util/List;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    .line 2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    not-int v1, v1

    not-int v1, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p0, p1}, Le/f/b/b/k;->b(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public iterator()Le/f/b/b/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/u0<",
            "TE;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/f/b/b/g;->listIterator()Le/f/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/b/b/g;->iterator()Le/f/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p0, p1}, Le/f/b/b/k;->d(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public listIterator()Le/f/b/b/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/v0<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Le/f/b/b/g;->listIterator(I)Le/f/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Le/f/b/b/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Le/f/b/b/v0<",
            "TE;>;"
        }
    .end annotation

    .line 4
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, v0}, Le/f/b/a/p;->b(II)I

    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object p1, Le/f/b/b/g;->c:Le/f/b/b/v0;

    return-object p1

    .line 7
    :cond_0
    new-instance v0, Le/f/b/b/f;

    invoke-direct {v0, p0, p1}, Le/f/b/b/f;-><init>(Le/f/b/b/g;I)V

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/b/b/g;->listIterator()Le/f/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Le/f/b/b/g;->listIterator(I)Le/f/b/b/v0;

    move-result-object p1

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public subList(II)Le/f/b/b/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Le/f/b/a/p;->b(III)V

    sub-int v0, p2, p1

    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    if-nez v0, :cond_1

    .line 4
    invoke-static {}, Le/f/b/b/g;->of()Le/f/b/b/g;

    move-result-object p1

    return-object p1

    .line 5
    :cond_1
    invoke-virtual {p0, p1, p2}, Le/f/b/b/g;->a(II)Le/f/b/b/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/f/b/b/g;->subList(II)Le/f/b/b/g;

    move-result-object p1

    return-object p1
.end method
