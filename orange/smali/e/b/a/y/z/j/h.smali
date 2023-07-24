.class public Le/b/a/y/z/j/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/z/j/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/z/j/e<",
        "TZ;TZ;>;"
    }
.end annotation


# static fields
.field public static final a:Le/b/a/y/z/j/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/z/j/h<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/z/j/h;

    invoke-direct {v0}, Le/b/a/y/z/j/h;-><init>()V

    sput-object v0, Le/b/a/y/z/j/h;->a:Le/b/a/y/z/j/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/b/a/y/z/j/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">()",
            "Le/b/a/y/z/j/e<",
            "TZ;TZ;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/z/j/h;->a:Le/b/a/y/z/j/h;

    return-object v0
.end method


# virtual methods
.method public a(Le/b/a/y/x/y0;Le/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TZ;>;",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "TZ;>;"
        }
    .end annotation

    return-object p1
.end method
