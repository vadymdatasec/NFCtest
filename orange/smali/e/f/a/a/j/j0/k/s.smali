.class public final synthetic Le/f/a/a/j/j0/k/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/f0;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/k/s;->a:Ljava/util/Map;

    return-void
.end method

.method public static a(Ljava/util/Map;)Le/f/a/a/j/j0/k/f0;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/s;

    invoke-direct {v0, p0}, Le/f/a/a/j/j0/k/s;-><init>(Ljava/util/Map;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/a/a/j/j0/k/s;->a:Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Le/f/a/a/j/j0/k/i0;->a(Ljava/util/Map;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
