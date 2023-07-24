.class public Le/b/a/y/y/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field public static final a:Le/b/a/y/y/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/t1<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/y/t1;

    invoke-direct {v0}, Le/b/a/y/y/t1;-><init>()V

    sput-object v0, Le/b/a/y/y/t1;->a:Le/b/a/y/y/t1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/b/a/y/y/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Le/b/a/y/y/t1<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/y/t1;->a:Le/b/a/y/y/t1;

    return-object v0
.end method


# virtual methods
.method public a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "TModel;TModel;>;"
        }
    .end annotation

    .line 2
    invoke-static {}, Le/b/a/y/y/v1;->a()Le/b/a/y/y/v1;

    move-result-object p1

    return-object p1
.end method
