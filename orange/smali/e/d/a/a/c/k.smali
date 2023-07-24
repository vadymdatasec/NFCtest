.class public Le/d/a/a/c/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Date;

.field public b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/d/a/a/c/k;->a:Ljava/util/Date;

    .line 3
    iput-object v0, p0, Le/d/a/a/c/k;->b:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Le/d/a/a/c/h;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Le/d/a/a/c/k;-><init>()V

    return-void
.end method
