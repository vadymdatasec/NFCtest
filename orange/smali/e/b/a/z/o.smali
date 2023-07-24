.class public Le/b/a/z/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/z/n;


# instance fields
.field public final synthetic b:Lc/n/g;

.field public final synthetic c:Le/b/a/z/q;


# direct methods
.method public constructor <init>(Le/b/a/z/q;Lc/n/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/z/o;->c:Le/b/a/z/q;

    iput-object p2, p0, Le/b/a/z/o;->b:Lc/n/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/z/o;->c:Le/b/a/z/q;

    iget-object v0, v0, Le/b/a/z/q;->a:Ljava/util/Map;

    iget-object v1, p0, Le/b/a/z/o;->b:Lc/n/g;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
