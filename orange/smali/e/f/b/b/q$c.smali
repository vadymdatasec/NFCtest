.class public abstract Le/f/b/b/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/b/b/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:I

.field public c:I

.field public d:Le/f/b/b/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/u<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation
.end field

.field public e:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "TE;>;"
        }
    .end annotation
.end field

.field public f:Le/f/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field public g:Le/f/b/b/q$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/q<",
            "TK;TV;TE;TS;>.h;"
        }
    .end annotation
.end field

.field public h:Le/f/b/b/q$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/q<",
            "TK;TV;TE;TS;>.h;"
        }
    .end annotation
.end field

.field public final synthetic i:Le/f/b/b/q;


# direct methods
.method public constructor <init>(Le/f/b/b/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/b/b/q$c;->i:Le/f/b/b/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object p1, p1, Le/f/b/b/q;->d:[Le/f/b/b/u;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Le/f/b/b/q$c;->b:I

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Le/f/b/b/q$c;->c:I

    .line 4
    invoke-virtual {p0}, Le/f/b/b/q$c;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Le/f/b/b/q$c;->g:Le/f/b/b/q$h;

    .line 2
    invoke-virtual {p0}, Le/f/b/b/q$c;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Le/f/b/b/q$c;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget v0, p0, Le/f/b/b/q$c;->b:I

    if-ltz v0, :cond_2

    .line 5
    iget-object v1, p0, Le/f/b/b/q$c;->i:Le/f/b/b/q;

    iget-object v1, v1, Le/f/b/b/q;->d:[Le/f/b/b/u;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Le/f/b/b/q$c;->b:I

    aget-object v0, v1, v0

    iput-object v0, p0, Le/f/b/b/q$c;->d:Le/f/b/b/u;

    .line 6
    iget v0, v0, Le/f/b/b/u;->c:I

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Le/f/b/b/q$c;->d:Le/f/b/b/u;

    iget-object v0, v0, Le/f/b/b/u;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput-object v0, p0, Le/f/b/b/q$c;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Le/f/b/b/q$c;->c:I

    .line 9
    invoke-virtual {p0}, Le/f/b/b/q$c;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    return-void
.end method

.method public a(Le/f/b/b/r;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 10
    :try_start_0
    invoke-interface {p1}, Le/f/b/b/r;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 11
    iget-object v1, p0, Le/f/b/b/q$c;->i:Le/f/b/b/q;

    invoke-virtual {v1, p1}, Le/f/b/b/q;->a(Le/f/b/b/r;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 12
    new-instance v1, Le/f/b/b/q$h;

    iget-object v2, p0, Le/f/b/b/q$c;->i:Le/f/b/b/q;

    invoke-direct {v1, v2, v0, p1}, Le/f/b/b/q$h;-><init>(Le/f/b/b/q;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Le/f/b/b/q$c;->g:Le/f/b/b/q$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 13
    :goto_0
    iget-object v0, p0, Le/f/b/b/q$c;->d:Le/f/b/b/u;

    invoke-virtual {v0}, Le/f/b/b/u;->e()V

    return p1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Le/f/b/b/q$c;->d:Le/f/b/b/u;

    invoke-virtual {v0}, Le/f/b/b/u;->e()V

    .line 14
    throw p1
.end method

.method public b()Le/f/b/b/q$h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/q<",
            "TK;TV;TE;TS;>.h;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/q$c;->g:Le/f/b/b/q$h;

    if-eqz v0, :cond_0

    .line 2
    iput-object v0, p0, Le/f/b/b/q$c;->h:Le/f/b/b/q$h;

    .line 3
    invoke-virtual {p0}, Le/f/b/b/q$c;->a()V

    .line 4
    iget-object v0, p0, Le/f/b/b/q$c;->h:Le/f/b/b/q$h;

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$c;->f:Le/f/b/b/r;

    if-eqz v0, :cond_1

    .line 2
    :goto_0
    invoke-interface {v0}, Le/f/b/b/r;->b()Le/f/b/b/r;

    move-result-object v0

    iput-object v0, p0, Le/f/b/b/q$c;->f:Le/f/b/b/r;

    iget-object v0, p0, Le/f/b/b/q$c;->f:Le/f/b/b/r;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0, v0}, Le/f/b/b/q$c;->a(Le/f/b/b/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 4
    :cond_0
    iget-object v0, p0, Le/f/b/b/q$c;->f:Le/f/b/b/r;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 3

    .line 1
    :cond_0
    iget v0, p0, Le/f/b/b/q$c;->c:I

    if-ltz v0, :cond_2

    .line 2
    iget-object v1, p0, Le/f/b/b/q$c;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Le/f/b/b/q$c;->c:I

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/b/b/r;

    iput-object v0, p0, Le/f/b/b/q$c;->f:Le/f/b/b/r;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Le/f/b/b/q$c;->a(Le/f/b/b/r;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Le/f/b/b/q$c;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$c;->g:Le/f/b/b/q$h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public remove()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/b/b/q$c;->h:Le/f/b/b/q$h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Le/f/b/b/c;->a(Z)V

    .line 2
    iget-object v0, p0, Le/f/b/b/q$c;->i:Le/f/b/b/q;

    iget-object v1, p0, Le/f/b/b/q$c;->h:Le/f/b/b/q$h;

    invoke-virtual {v1}, Le/f/b/b/q$h;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/b/b/q;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/f/b/b/q$c;->h:Le/f/b/b/q$h;

    return-void
.end method
