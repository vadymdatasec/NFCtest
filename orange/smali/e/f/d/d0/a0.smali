.class public Le/f/d/d0/a0;
.super Le/f/d/d0/x$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/d0/x<",
        "TV;>.c<TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le/f/d/d0/x$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, Le/f/d/d0/x$d;->b:Le/f/d/d0/x;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le/f/d/d0/x$c;-><init>(Le/f/d/d0/x;Le/f/d/d0/v;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/d/d0/x$c;->a()Le/f/d/d0/z;

    move-result-object v0

    iget-object v0, v0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    return-object v0
.end method
