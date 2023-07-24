.class public Le/d/a/a/c/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/security/cert/Certificate;",
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
    iput-boolean v0, p0, Le/d/a/a/c/i;->a:Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/d/a/a/c/i;->b:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Le/d/a/a/c/h;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Le/d/a/a/c/i;-><init>()V

    return-void
.end method
