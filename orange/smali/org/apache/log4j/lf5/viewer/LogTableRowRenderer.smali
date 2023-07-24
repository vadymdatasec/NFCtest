.class public Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;
.super Ljavax/swing/table/DefaultTableCellRenderer;
.source "SourceFile"


# instance fields
.field public a:Ljava/awt/Color;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljavax/swing/table/DefaultTableCellRenderer;-><init>()V

    .line 2
    new-instance v0, Ljava/awt/Color;

    const/16 v1, 0xe6

    invoke-direct {v0, v1, v1, v1}, Ljava/awt/Color;-><init>(III)V

    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->a:Ljava/awt/Color;

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/log4j/lf5/LogLevel;)Ljava/awt/Color;
    .locals 1

    .line 1
    invoke-static {}, Lorg/apache/log4j/lf5/LogLevel;->getLogLevelColorMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/awt/Color;

    return-object p1
.end method

.method public getTableCellRendererComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;
    .locals 1

    .line 1
    rem-int/lit8 v0, p5, 0x2

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->a:Ljava/awt/Color;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->setBackground(Ljava/awt/Color;)V

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Ljava/awt/Color;->white:Ljava/awt/Color;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->setBackground(Ljava/awt/Color;)V

    .line 4
    :goto_0
    invoke-virtual {p1}, Ljavax/swing/JTable;->getModel()Ljavax/swing/table/TableModel;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    .line 5
    invoke-virtual {v0, p5}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->a(I)Lorg/apache/log4j/lf5/LogRecord;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->a(Lorg/apache/log4j/lf5/LogLevel;)Ljava/awt/Color;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->setForeground(Ljava/awt/Color;)V

    .line 7
    invoke-super/range {p0 .. p6}, Ljavax/swing/table/DefaultTableCellRenderer;->getTableCellRendererComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;

    move-result-object p1

    return-object p1
.end method
