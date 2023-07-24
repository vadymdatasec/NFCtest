.class public final Le/b/a/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/b/a/k;->a:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Le/b/a/k;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Le/b/a/k;->a:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public a()Le/b/a/l;
    .locals 1

    .line 2
    new-instance v0, Le/b/a/l;

    invoke-direct {v0, p0}, Le/b/a/l;-><init>(Le/b/a/k;)V

    return-object v0
.end method
