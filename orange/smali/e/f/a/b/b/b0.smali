.class public final synthetic Le/f/a/b/b/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/f;


# static fields
.field public static final a:Le/f/a/b/h/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/a/b/b/b0;

    invoke-direct {v0}, Le/f/a/b/b/b0;-><init>()V

    sput-object v0, Le/f/a/b/b/b0;->a:Le/f/a/b/h/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Le/f/a/b/h/g;
    .locals 0

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p1}, Le/f/a/b/b/e;->c(Landroid/os/Bundle;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
