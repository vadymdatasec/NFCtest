.class public final Le/f/b/b/q$e;
.super Le/f/b/b/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/b/b/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/b/b/t<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Le/f/b/b/q;


# direct methods
.method public constructor <init>(Le/f/b/b/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/b/b/q$e;->b:Le/f/b/b/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le/f/b/b/t;-><init>(Le/f/b/b/m;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$e;->b:Le/f/b/b/q;

    invoke-virtual {v0}, Le/f/b/b/q;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$e;->b:Le/f/b/b/q;

    invoke-virtual {v0, p1}, Le/f/b/b/q;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$e;->b:Le/f/b/b/q;

    invoke-virtual {v0}, Le/f/b/b/q;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/b/b/q$d;

    iget-object v1, p0, Le/f/b/b/q$e;->b:Le/f/b/b/q;

    invoke-direct {v0, v1}, Le/f/b/b/q$d;-><init>(Le/f/b/b/q;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$e;->b:Le/f/b/b/q;

    invoke-virtual {v0, p1}, Le/f/b/b/q;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$e;->b:Le/f/b/b/q;

    invoke-virtual {v0}, Le/f/b/b/q;->size()I

    move-result v0

    return v0
.end method
