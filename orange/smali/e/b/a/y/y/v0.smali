.class public Le/b/a/y/y/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/n;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/n;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/w/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/w/e<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/n;Le/b/a/y/w/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Le/b/a/y/w/e<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Ljava/util/List;Le/b/a/y/w/e;)V

    return-void
.end method

.method public constructor <init>(Le/b/a/y/n;Ljava/util/List;Le/b/a/y/w/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Ljava/util/List<",
            "Le/b/a/y/n;",
            ">;",
            "Le/b/a/y/w/e<",
            "TData;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/n;

    iput-object p1, p0, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    .line 4
    invoke-static {p2}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Le/b/a/y/y/v0;->b:Ljava/util/List;

    .line 5
    invoke-static {p3}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, Le/b/a/y/w/e;

    iput-object p3, p0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    return-void
.end method
