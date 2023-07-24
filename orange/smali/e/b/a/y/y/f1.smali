.class public Le/b/a/y/y/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lc/h/m/d;)Le/b/a/y/y/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Le/b/a/y/y/w0<",
            "TModel;TData;>;>;",
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)",
            "Le/b/a/y/y/c1<",
            "TModel;TData;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/y/c1;

    invoke-direct {v0, p1, p2}, Le/b/a/y/y/c1;-><init>(Ljava/util/List;Lc/h/m/d;)V

    return-object v0
.end method
