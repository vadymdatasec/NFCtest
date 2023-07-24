.class public Le/f/d/d0/w;
.super Le/f/d/d0/x$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/d0/x<",
        "TV;>.c<",
        "Ljava/util/Map$Entry<",
        "Ljava/lang/String;",
        "TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le/f/d/d0/x$a;)V
    .locals 1

    .line 1
    iget-object p1, p1, Le/f/d/d0/x$a;->b:Le/f/d/d0/x;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le/f/d/d0/x$c;-><init>(Le/f/d/d0/x;Le/f/d/d0/v;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/d/d0/w;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public final next()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "TV;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/f/d/d0/x$c;->a()Le/f/d/d0/z;

    move-result-object v0

    return-object v0
.end method
