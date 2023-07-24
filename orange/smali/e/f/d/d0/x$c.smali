.class public abstract Le/f/d/d0/x$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/d/d0/x;
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
.field public b:Le/f/d/d0/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation
.end field

.field public c:Le/f/d/d0/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Le/f/d/d0/x;


# direct methods
.method public constructor <init>(Le/f/d/d0/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/d/d0/x$c;->d:Le/f/d/d0/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object p1, p0, Le/f/d/d0/x$c;->d:Le/f/d/d0/x;

    invoke-static {p1}, Le/f/d/d0/x;->a(Le/f/d/d0/x;)Le/f/d/d0/z;

    move-result-object p1

    iget-object p1, p1, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    iput-object p1, p0, Le/f/d/d0/x$c;->b:Le/f/d/d0/z;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Le/f/d/d0/x$c;->c:Le/f/d/d0/z;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/d/d0/x;Le/f/d/d0/v;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Le/f/d/d0/x$c;-><init>(Le/f/d/d0/x;)V

    return-void
.end method


# virtual methods
.method public final a()Le/f/d/d0/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$c;->b:Le/f/d/d0/z;

    .line 2
    iget-object v1, p0, Le/f/d/d0/x$c;->d:Le/f/d/d0/x;

    invoke-static {v1}, Le/f/d/d0/x;->a(Le/f/d/d0/x;)Le/f/d/d0/z;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v1, v0, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    iput-object v1, p0, Le/f/d/d0/x$c;->b:Le/f/d/d0/z;

    .line 4
    iput-object v0, p0, Le/f/d/d0/x$c;->c:Le/f/d/d0/z;

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$c;->b:Le/f/d/d0/z;

    iget-object v1, p0, Le/f/d/d0/x$c;->d:Le/f/d/d0/x;

    invoke-static {v1}, Le/f/d/d0/x;->a(Le/f/d/d0/x;)Le/f/d/d0/z;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$c;->c:Le/f/d/d0/z;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Le/f/d/d0/x$c;->d:Le/f/d/d0/x;

    iget-object v0, v0, Le/f/d/d0/z;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Le/f/d/d0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/f/d/d0/x$c;->c:Le/f/d/d0/z;

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
