.class public Lm/a/a/a/b/b;
.super Ljava/util/AbstractCollection;
.source "SourceFile"

# interfaces
.implements Ljava/util/Queue;
.implements Lm/a/a/a/a;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractCollection<",
        "TE;>;",
        "Ljava/util/Queue<",
        "TE;>;",
        "Lm/a/a/a/a<",
        "TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public transient b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field public transient c:I

.field public transient d:I

.field public transient e:Z

.field public final f:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm/a/a/a/b/b;->c:I

    .line 3
    iput v0, p0, Lm/a/a/a/b/b;->d:I

    .line 4
    iput-boolean v0, p0, Lm/a/a/a/b/b;->e:Z

    if-lez p1, :cond_0

    .line 5
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lm/a/a/a/b/b;->b:[Ljava/lang/Object;

    .line 6
    array-length p1, p1

    iput p1, p0, Lm/a/a/a/b/b;->f:I

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The size must be greater than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lm/a/a/a/b/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lm/a/a/a/b/b;->c:I

    return p0
.end method

.method public static synthetic a(Lm/a/a/a/b/b;I)I
    .locals 0

    .line 3
    iput p1, p0, Lm/a/a/a/b/b;->d:I

    return p1
.end method

.method public static synthetic a(Lm/a/a/a/b/b;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lm/a/a/a/b/b;->e:Z

    return p1
.end method

.method public static synthetic b(Lm/a/a/a/b/b;I)I
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lm/a/a/a/b/b;->b(I)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lm/a/a/a/b/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lm/a/a/a/b/b;->e:Z

    return p0
.end method

.method public static synthetic c(Lm/a/a/a/b/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lm/a/a/a/b/b;->d:I

    return p0
.end method

.method public static synthetic c(Lm/a/a/a/b/b;I)I
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lm/a/a/a/b/b;->a(I)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lm/a/a/a/b/b;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lm/a/a/a/b/b;->b:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic e(Lm/a/a/a/b/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lm/a/a/a/b/b;->f:I

    return p0
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    add-int/lit8 p1, p1, -0x1

    if-gez p1, :cond_0

    .line 5
    iget p1, p0, Lm/a/a/a/b/b;->f:I

    add-int/lit8 p1, p1, -0x1

    :cond_0
    return p1
.end method

.method public a()Z
    .locals 2

    .line 4
    invoke-virtual {p0}, Lm/a/a/a/b/b;->size()I

    move-result v0

    iget v1, p0, Lm/a/a/a/b/b;->f:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p0}, Lm/a/a/a/b/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lm/a/a/a/b/b;->remove()Ljava/lang/Object;

    .line 3
    :cond_0
    iget-object v0, p0, Lm/a/a/a/b/b;->b:[Ljava/lang/Object;

    iget v1, p0, Lm/a/a/a/b/b;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lm/a/a/a/b/b;->d:I

    aput-object p1, v0, v1

    .line 4
    iget p1, p0, Lm/a/a/a/b/b;->f:I

    if-lt v2, p1, :cond_1

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lm/a/a/a/b/b;->d:I

    .line 6
    :cond_1
    iget p1, p0, Lm/a/a/a/b/b;->d:I

    iget v0, p0, Lm/a/a/a/b/b;->c:I

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    .line 7
    iput-boolean v1, p0, Lm/a/a/a/b/b;->e:Z

    :cond_2
    return v1

    .line 8
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Attempted to add null object to queue"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    .line 3
    iget v0, p0, Lm/a/a/a/b/b;->f:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public clear()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lm/a/a/a/b/b;->e:Z

    .line 2
    iput v0, p0, Lm/a/a/a/b/b;->c:I

    .line 3
    iput v0, p0, Lm/a/a/a/b/b;->d:I

    .line 4
    iget-object v0, p0, Lm/a/a/a/b/b;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public element()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lm/a/a/a/b/b;->peek()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "queue is empty"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/a/a/a/b/b;->size()I

    move-result v0

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 2
    iget v0, p0, Lm/a/a/a/b/b;->c:I

    add-int/2addr v0, p1

    iget p1, p0, Lm/a/a/a/b/b;->f:I

    rem-int/2addr v0, p1

    .line 3
    iget-object p1, p0, Lm/a/a/a/b/b;->b:[Ljava/lang/Object;

    aget-object p1, p1, v0

    return-object p1

    .line 4
    :cond_0
    new-instance v1, Ljava/util/NoSuchElementException;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    const/4 p1, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, p1

    const-string p1, "The specified index (%1$d) is outside the available range [0, %2$d)"

    .line 6
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/a/a/a/b/b;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lm/a/a/a/b/a;

    invoke-direct {v0, p0}, Lm/a/a/a/b/a;-><init>(Lm/a/a/a/b/b;)V

    return-object v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lm/a/a/a/b/b;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public peek()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lm/a/a/a/b/b;->b:[Ljava/lang/Object;

    iget v1, p0, Lm/a/a/a/b/b;->c:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public poll()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lm/a/a/a/b/b;->remove()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Lm/a/a/a/b/b;->b:[Ljava/lang/Object;

    iget v1, p0, Lm/a/a/a/b/b;->c:I

    aget-object v2, v0, v1

    if-eqz v2, :cond_1

    add-int/lit8 v3, v1, 0x1

    .line 3
    iput v3, p0, Lm/a/a/a/b/b;->c:I

    const/4 v4, 0x0

    aput-object v4, v0, v1

    .line 4
    iget v0, p0, Lm/a/a/a/b/b;->f:I

    const/4 v1, 0x0

    if-lt v3, v0, :cond_0

    .line 5
    iput v1, p0, Lm/a/a/a/b/b;->c:I

    .line 6
    :cond_0
    iput-boolean v1, p0, Lm/a/a/a/b/b;->e:Z

    :cond_1
    return-object v2

    .line 7
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "queue is empty"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public size()I
    .locals 3

    .line 1
    iget v0, p0, Lm/a/a/a/b/b;->d:I

    iget v1, p0, Lm/a/a/a/b/b;->c:I

    if-ge v0, v1, :cond_0

    .line 2
    iget v2, p0, Lm/a/a/a/b/b;->f:I

    sub-int/2addr v2, v1

    add-int/2addr v2, v0

    goto :goto_0

    :cond_0
    if-ne v0, v1, :cond_2

    .line 3
    iget-boolean v0, p0, Lm/a/a/a/b/b;->e:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lm/a/a/a/b/b;->f:I

    move v2, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    sub-int v2, v0, v1

    :goto_0
    return v2
.end method
