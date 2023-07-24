.class public final synthetic Le/f/a/d/a/b/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/b/k1;


# instance fields
.field public final a:Le/f/a/d/a/b/l1;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/l1;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/d1;->a:Le/f/a/d/a/b/l1;

    iput-object p2, p0, Le/f/a/d/a/b/d1;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/d1;->a:Le/f/a/d/a/b/l1;

    iget-object v1, p0, Le/f/a/d/a/b/d1;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Le/f/a/d/a/b/l1;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
