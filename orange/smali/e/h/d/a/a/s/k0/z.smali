.class public abstract Le/h/d/a/a/s/k0/z;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le/h/d/a/a/s/k0/d;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/z;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/k0/z;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Landroid/content/ContentValues;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroid/content/ContentValues;"
        }
    .end annotation
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/s/k0/z;->b:Ljava/lang/String;

    iget-object v1, p0, Le/h/d/a/a/s/k0/z;->a:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Le/h/d/a/a/s/k0/z;->a(Ljava/lang/Object;)Landroid/content/ContentValues;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    return-object v2
.end method
