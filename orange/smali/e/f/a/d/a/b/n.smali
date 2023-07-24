.class public final Le/f/a/d/a/b/n;
.super Le/f/a/d/a/b/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/a/d/a/b/l<",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Le/f/a/d/a/b/q;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/o<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Le/f/a/d/a/b/n;->c:Le/f/a/d/a/b/q;

    invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Le/f/a/d/a/b/l;->a(Ljava/util/List;)V

    iget-object v0, p0, Le/f/a/d/a/b/n;->c:Le/f/a/d/a/b/q;

    invoke-static {v0, p1}, Le/f/a/d/a/b/q;->a(Le/f/a/d/a/b/q;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Le/f/a/d/a/b/l;->a:Le/f/a/d/a/i/o;

    invoke-virtual {v0, p1}, Le/f/a/d/a/i/o;->b(Ljava/lang/Object;)V

    return-void
.end method
