.class public final Lk/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/i;",
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
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/h;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lk/j;
    .locals 3

    .line 1
    new-instance v0, Lk/j;

    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p0, Lk/h;->a:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk/j;-><init>(Ljava/util/Set;Lk/e1/n/c;)V

    return-object v0
.end method
